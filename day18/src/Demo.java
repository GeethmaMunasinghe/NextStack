//igi
interface Gun{
     void fire();
}
class Ak47 implements Gun{
    public void fire(){
        System.out.println("AK47:Round 580 for now");
    }
}
class Dragnow implements Gun{
    public void fire(){
        System.out.println("Dragnow:Round 120 for now");
    }
}
class Soldier{
    void shoot(Gun gun){
        gun.fire();
    }
}
public class Demo {
    public static void main(String[] args) {
        Soldier soldier=new Soldier();
        Dragnow dragnow=new Dragnow();
        soldier.shoot(dragnow);
    }
}
