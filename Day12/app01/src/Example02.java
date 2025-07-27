
class MyClass{
    int x;//instance attributes
    static int y;//static variable / class variable / template variable
}
public class Example02 {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.x=5;

        MyClass.y=10;
        //MyClass.x=15;  ---> We cannot do this

        MyClass obj2=new MyClass();
        obj2.x=20;
        obj2.y=30;

        System.out.println(obj.x+","+obj.y);
        System.out.println(obj2.x+","+obj2.y);
    }
}
