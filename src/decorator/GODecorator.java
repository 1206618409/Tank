package decorator;

import zhj.GameObject;

import java.awt.*;

public abstract class GODecorator extends GameObject {
    GameObject go;
    int WIDTH,HEIGHT;
    public GODecorator(GameObject go){
        this.x = x;
        this.y = y;
        this.go = go;

    }
    @Override
    public abstract void paint(Graphics g);
}
