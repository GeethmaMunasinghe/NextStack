class Animal{
    public void sound(){

    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow Meow");
    }
}

public class Example01 {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.sound();
        c1.hashCode();
        c1.toString();
        Object obj=new Cat(); //Dynamic method dispatch
    }
}
