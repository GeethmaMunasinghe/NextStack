class Vehicle6{
    //final-->constant
    final public   void park(){
        System.out.println("Vehicle parking");
    }

}
class Car6 extends Vehicle6{
    /*public  void park(){
        System.out.println("Vehicle parking");
    }*/
}


public class Example06 {
    public static void main(String[] args){
        Vehicle6 car=new Car6();//dynamic method dispatch,r
        car.park();//cant override static methods

    }
}
