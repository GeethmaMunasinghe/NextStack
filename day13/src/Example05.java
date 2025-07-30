class A1{
    int a=1;
    public void printA1(){
        System.out.println("PrintA1(): "+a);

    }
    static {
        System.out.println("Static block A1");
    }
}

class B1 extends A1{
    int b=2;
    public void printB1(){
        System.out.println("PrintB1(): "+b);

    }
    static {
        System.out.println("Static block B1");
    }
}
public class Example05 {
    public static void main(String[] args) {
        new B1();
    }
}
