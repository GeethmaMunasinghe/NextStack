class Student1{
    int id;
    String name;
    Student1(){

    }

    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class Example06 {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        System.out.println(s1.id);//0
    }

}
