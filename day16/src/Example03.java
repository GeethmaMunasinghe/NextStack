class Customer3{
    int id;
    String name;

    Customer3(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Box3{

}
public class Example03 {
        public static void main(String[] args) {
            Customer c1=new Customer(1,"Akila");
            Customer c2=new Customer(2,"Lakindu");
            Customer c3=new Customer(3,"Dilshan");
            int hash=c1.hashCode();
            System.out.println(Integer.toHexString(hash));//hascode
            System.out.println(c1);//object eke memory location eke reference //class+@+
            System.out.println(c1.getClass().getName()+"@"+Integer.toHexString(hash));
            Customer c4=c1;
            System.out.println(c1==c2);
            System.out.println(c1==c4);

            System.out.println(c1.equals(c4));
            System.out.println(c1.equals(c2));


  /*      System.out.println("c1: "+c1.hashCode());
        System.out.println("c2: "+c2.hashCode());
        System.out.println("c3: "+c3.hashCode());*/
        }

}
