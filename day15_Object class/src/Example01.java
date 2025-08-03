class SayHi{
    public void sayHi(){
        System.out.println("Hi");
    }
}
class A extends SayHi{
    public void printData(){
        System.out.println("Hello world!");
    }
}

class Customer extends A{

}
public class Example01 {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.printData();
        c.sayHi();
    }
}
