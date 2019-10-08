package zhj;
import java.awt.*;

public class Bullet extends GameObject{
    private static final int SPEED = Integer.parseInt((String)PropertyMgr.get("bulletSpeed"));
    public static int WIDTH = ResourceMgr.bulletL.getWidth();
    public static int HEIGHT = ResourceMgr.bulletL.getHeight();
    private Dir dir;
    public boolean living = true;
    GameModel gm = null;
    private TankFrame tf = null;
    private Group group = Group.BAD;
    Rectangle rect = new Rectangle();
    public static int getSPEED() {
        return SPEED;
    }

    public boolean isLiving() {
        return living;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Bullet(int x, int y, Dir dir, Group group){
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        rect.x = x;
        rect.y = y;
        rect.width = WIDTH;
        rect.height = HEIGHT;
        GameModel.getInstance().add(this);
    }
    public void paint(Graphics g){
        if(!living){
           GameModel.getInstance().remove(this);
        }
        switch (dir){
        case LEFT:
            g.drawImage(ResourceMgr.bulletL, x, y, null);
            break; 
        case UP:
            g.drawImage(ResourceMgr.bulletU, x, y, null);
            break;
        case RIGHT:
            g.drawImage(ResourceMgr.bulletR, x, y, null);
            break;
        case DOWN:
            g.drawImage(ResourceMgr.bulletD, x, y, null);
            break;
        }
        move();
    }

    @Override
    public int getWIDTH() {
        return WIDTH;
    }

    @Override
    public int getHEIGHT() {
        return HEIGHT;
    }

    private void move(){
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
        //update rect
        rect.x = this.x;
        rect.y = this.y;
        if(x < 0||y < 0||x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) living = false;
    }

    public void die(){
        this.living = false;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
}
