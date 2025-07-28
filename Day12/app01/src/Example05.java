class MyClass2{
    static {
        System.out.println("Static Block."); //1
    }
    {
        System.out.println("Instance Block.");//2,4
    }
    MyClass2(){
        System.out.println("Constructor."); //3,5
    }
}
public class Example05 {
    public static void main(String[] args) {
        MyClass2 obj=new MyClass2();
        System.out.println("-----------------------");
        MyClass2 obj2=new MyClass2();

    }
}
