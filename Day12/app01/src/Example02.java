
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
    }
}
