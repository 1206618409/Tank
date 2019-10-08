package zhj;

import java.awt.*;

public abstract class GameObject {
    public int x,y,WIDTH,HEIGHT;
    public abstract void paint(Graphics g);
    public abstract int getWIDTH();
    public abstract int getHEIGHT();

}
