//Nested inner classes
class Outer{
    void printOuter(){
        System.out.println("Outer");
    }
    class Inner{
        void printInner(){
            System.out.println("Inner");
        }
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.printOuter();

        Outer.Inner i=o.new Inner();
        i.printInner();
    }
}
