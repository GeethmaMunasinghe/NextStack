class Singer{ // base class, super class, parent class
    public void sing(){
        System.out.println("I can sing.");
    }
}
class Charitha extends Singer{ //child class, derived class, sub class

}
public class Example02 {
    public static void main(String[] args) {
        Charitha c=new Charitha();
        c.sing();
    }
}
