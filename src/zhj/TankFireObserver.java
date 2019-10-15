package zhj;

import java.io.Serializable;

public interface TankFireObserver extends Serializable {
    void actionOnFire(TankFireEven e);

}
