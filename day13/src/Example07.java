class A7{
    static {
        System.out.println("static block A");
    }
    public void printA(){
        System.out.println("Print A");
        //printB(); we cannot access subclass methods
    }
}
class B7 extends A7{
    static {
        System.out.println("static block B");
    }
    public void printB(){
        System.out.println("Print B");
        printA();
    }
}
public class Example07 {
    public static void main(String[] args) {

    }
}
