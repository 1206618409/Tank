package zhj;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        new Thread(()->new Audio("audio/mzh.wav").play()).start();
        while(true){
            Thread.sleep(50);
            tf.repaint();
        }
    } 
}  
