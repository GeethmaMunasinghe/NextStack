class Student{
    int num;
    //A method --> Constructor
    Student(){
        num=10;

    }
    {
        num=100;
        
    }

}
public class Example03 {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.num);
    }
}
/*//object intialization
class Student{
    int num;//instance variable

    Student(int num){ //parameterized constructor
     this.num=num;
    }
    Student(){//no arg constructor
        num=0;
    }
}

public class Example {
    public static void main(String[] args) {
        Student s1=new Student(10);
        System.out.println(s1.num);

        Student s2=new Student();//
        System.out.println(s2.num);//?????????????

    }
}*/