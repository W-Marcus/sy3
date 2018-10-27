package exe1;

/**
 * Created by Marcus_w on 2018/10/23.
 */
public class Dog {
    String name;
    int health;
    int intimacy;
    String variety;
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public int getIntimacy() {
        return intimacy;
    }

//    public void setIntimacy(int intimacy) {
//        this.intimacy = intimacy;
//    }

    public String getVariety() {
        return variety;
    }

//    public void setVariety(String variety) {
//        this.variety = variety;
//    }


    Dog(String name,int health,int intimacy,String variety){
        this.name = name;
        this.health = health;
        this.intimacy = intimacy;
        this.variety = variety;
    }
}
