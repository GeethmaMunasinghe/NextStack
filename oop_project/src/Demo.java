class Soldier{// Encapsulation concept
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Soldier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Soldier() {
    }

    public Soldier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
interface Gun{
    void fire();
}
class AK47 implements Gun{
    public void shoot(Gun gun,Soldier soldier){
        System.out.println(soldier);
        gun.fire();
    }
    public void fire(){
        System.out.println("AK47");
    }
}
class HK416 implements Gun{
    public void shoot(Gun gun,Soldier soldier){
        System.out.println(soldier);
        gun.fire();
    }
    public void fire(){
        System.out.println("HK416");
    }
}
public class Demo {
    public static void main(String[] args) {
        Soldier soldier1=new Soldier(1,"Geethma");
        Soldier soldier2=new Soldier(2,"Sandu");

        AK47 ak47=new AK47();
        HK416 hk416=new HK416();
        ak47.shoot(ak47,soldier1);
        hk416.shoot(hk416,soldier2);


    }
}
