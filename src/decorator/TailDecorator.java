package decorator;

import zhj.GameObject;

import java.awt.*;

public class TailDecorator extends GODecorator {

    public TailDecorator(GameObject go){
        super(go);
    }
    @Override
    public void paint(Graphics g){
        this.x = go.x;
        this.y = go.y;
        go.paint(g);
        Color c = g.getColor();
        g.setColor(Color.WHITE);
        g.drawLine(super.go.x,super.go.y,super.go.x+getWIDTH(),super.go.y+getHEIGHT());
        g.setColor(c);
    }

    @Override
    public int getWIDTH() {
        return super.go.getWIDTH();
    }

    @Override
    public int getHEIGHT() {
        return super.go.getHEIGHT();
    }


}
