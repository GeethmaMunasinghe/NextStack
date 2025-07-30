class A{
    int a=1;
    public void printA(){
        System.out.println("Print A: "+a);
    }
}

class B extends A{
    int b=2;
    public void printB(){
        System.out.println("Print B: "+b);
    }
    public void invokeBoth(){
        printB();
        printA();//legal
    }
    public void printBoth(){
        System.out.println("Print B: "+b);
        System.out.println("Print A: "+a);
    }
}
public class Example04 {
    public static void main(String[] args) {
        B b=new B();
        b.printB();

        b.invokeBoth();
        System.out.println("------------------------");
        b.printBoth();
    }
}
