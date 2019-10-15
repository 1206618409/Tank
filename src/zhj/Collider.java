package zhj;

import com.sun.net.httpserver.Filter;

import java.io.Serializable;

public interface Collider extends Serializable {
    boolean collide(GameObject o1, GameObject o2);
}
