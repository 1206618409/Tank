package decorator;

import zhj.GameObject;

import java.awt.*;

public class RectDecorator extends GODecorator {

    public RectDecorator(GameObject go){
        super(go);
    }
    @Override
    public void paint(Graphics g){
        this.x = go.x;
        this.y = go.y;
        go.paint(g);
        Color c = g.getColor();
            g.setColor(Color.WHITE);
        g.fillRect(go.x,go.y,go.getWIDTH()+2,go.getHEIGHT()+2);
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
