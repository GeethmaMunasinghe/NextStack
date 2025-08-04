class Customer4{
    int id;
    String name;

    Customer4(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "ID :"+this.id+"Name: "+this.name;
    }
}
class Box4{

}

public class Example04 {


        public static void main(String[] args) {
            Customer4 cus1=new Customer4(1,"Geethma");

            System.out.println(cus1);
            System.out.println(cus1.toString());


        }

}
