class Vehicle{
    public void park(){
        System.out.println("Vehicle parking");
    }
}
class Car extends Vehicle{
    public void park(){
        System.out.println("Car parking");
    }
}
class Bus extends Vehicle{
    public void park(){
        System.out.println("Bus parking");
    }
}
class Scooter extends Vehicle{
    public void park(){
        System.out.println("Scooter parking");
    }
}
public class Example05 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v=new Car();
        v.park();
        v=new Bus();
        v.park();
        v=new Scooter();
        v.park();

    }
}
