package zhj;

import java.util.LinkedList;
import java.util.List;

public class ColliderChain implements Collider{
    private List<Collider> colliders = new LinkedList<>();
    public ColliderChain(){
        add(new TankTankCollider());
        add(new BulletTankCollider());
        add(new BulletWallCollider());
        add(new TankWallCollider());
    }
    public void add(Collider c){
        colliders.add(c);
    }

    public boolean collide(GameObject o1, GameObject o2) {
        for (int i =0;i<colliders.size();i++ ){

            if (!colliders.get(i).collide(o1,o2)){
                return false;
            }
        }
        return true;
    }
}
