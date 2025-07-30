class Animal{
    public void walk(){
        System.out.println("I am walking.");
    }
}
class Cat extends Animal{

}
class Dog extends Animal{
    int age;
}
public class Example03 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.walk();

        new Dog().age=10;
        new Dog().walk(); //Anonymous Object
    }
}
