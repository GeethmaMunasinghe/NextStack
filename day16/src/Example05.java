class Vehicle{
    static public void park(){
        System.out.println("Vehicle parking");
    }
    public void horn(){

    }
}
class Car extends Vehicle{
    static public void park(){
        System.out.println("car parking");
    }
    public void horn(){
        System.out.println("Car horn");
    }
}
public class Example05 {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.park();//Can't override static methods
        car.horn();
    }
}
