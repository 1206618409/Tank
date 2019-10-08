package zhj;

import com.sun.net.httpserver.Filter;

public interface Collider {
    boolean collide(GameObject o1, GameObject o2);
}
