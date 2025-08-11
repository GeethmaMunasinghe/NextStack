class Outer2{
    void display(){
        class Inner{
            Inner(){
                System.out.println("Inner");
            }
            void print(){
                System.out.println("from method local inner class");
            }
        }
        Inner i=new Inner();
        i.print();
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Outer2 obj=new Outer2();
        obj.display();
    }
}
