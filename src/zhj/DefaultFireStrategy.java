package zhj;

import decorator.RectDecorator;
import decorator.TailDecorator;

public class DefaultFireStrategy implements FireStrategy {

@Override
    public void fire(Tank t) {
        int bx = t.getX()+ Tank.WIDTH /2 - Bullet.WIDTH/2;
        int by = t.getY()+ Tank.HEIGHT/2 - Bullet.HEIGHT/2;
        //Bug new Bullet把自己加了一遍
//        GameModel.getInstance().add(
//                new RectDecorator(
//                        new TailDecorator(
//                        new Bullet(bx,by,t.dir,t.group))));
     new Bullet(bx,by,t.dir,t.group);
        if(t.group == Group.GROUP) new Thread(()->new Audio("audio/mzh.wav").play()).start();
    }

}
