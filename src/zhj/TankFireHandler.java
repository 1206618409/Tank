package zhj;

public class TankFireHandler implements TankFireObserver {

    @Override
    public void actionOnFire(TankFireEven e) {
        Tank t = e.getSource();
        t.fire();
    }
}
