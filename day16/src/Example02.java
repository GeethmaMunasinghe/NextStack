class Customer{
    int id;
    String name;
    Customer(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Box{

}
public class Example02 {
    public static void main(String[] args) {
        Customer c1=new Customer(1,"Geethma");
        /*System.out.println(c1);//instance memory location unique id

        Class t1=c1.getClass();
        System.out.println(t1.getName());*/
        Customer c2=new Customer(2,"Thenuli");
        Customer c3=new Customer(3,"Danindu");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

    }
}
