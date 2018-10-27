package sy82;

/**
 * Created by Marcus_w on 2018/10/23.
 */
public abstract class Pet {
    String name="";
    int health = 100;
    int intimacy=20;
    abstract void print();
    String getName(){
        return name;
    }
    int getHealth(){
        return health;
    }
    int getIntimacy(){
        return intimacy;
    }

}
