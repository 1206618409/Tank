package zhj;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class GameModel {

    private static GameModel INSTANCE = new GameModel();
    static {
        INSTANCE.init();
    }
    Tank myTk;
    List<GameObject> objects = new ArrayList<>();
//    public List<Bullet> bullets = new ArrayList<>();
//    public List<Tank> tanks = new ArrayList<>();
//    public List<Explode> explodes = new ArrayList<>();
//    Collider collider = new BulletTankCollider();
//    Collider collider2 = new TankTankCollider();
    public static GameModel getInstance(){
        return INSTANCE;
    }
    ColliderChain chain = new ColliderChain();
    private GameModel(){
    }
    private void init(){
        myTk = new Tank(200,400,Dir.DOWN,Group.GROUP);
        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));
        for (int i = 0; i <initTankCount ; i++) {
            new Tank(50+i*80,200,Dir.DOWN,Group.BAD);
        }
        //初始化墙
        add(new Wall(150,150,200,50));
        add(new Wall(550,150,200,50));
        add(new Wall(300,300,50,200));
        add(new Wall(550,300,50,200));
    }
    public void add(GameObject go){
        this.objects.add(go);
    }

    public void remove(GameObject go){
        this.objects.remove(go);
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.white);
//        g.drawString("子弹的数量"+objects.size(),10,60);
//        g.drawString("敌人的数量"+objects.size(),10,80);
//        g.drawString("爆炸的数量"+objects.size(),10,100);
//        g.setColor(c);
        myTk.paint(g);

        for(int i = 0;i<objects.size();i++){
            objects.get(i).paint(g);
        }
        //互相碰撞
        for (int i = 0; i <objects.size() ; i++) {
            for (int j = i+1; j <objects.size() ; j++) {
                GameObject o1 = objects.get(i);
                GameObject o2 = objects.get(j);
            chain.collide(o1,o2);
            }
        }

    }

    public Tank getMainTank() {

        return myTk;

    }

}
