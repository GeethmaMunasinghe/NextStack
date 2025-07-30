class A4{
    public void print(){
        System.out.println("Print A");
    }
}
class B4 extends A4{
    public void print(){
        System.out.println("Print B");
    }
}

public class Example04 {
    public static void main(String[] args) {
        A4 a=new A4();
        a.print();
        B4 b=new B4();
        b.print();

        a=new B4();
        a.print();
    }
}
