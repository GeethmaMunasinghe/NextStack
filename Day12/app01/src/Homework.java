class Student2{
    int id;
    String name;
    Student2(int id,String name){
        this.id=id;
        this.name=name;
    }

    Student2(){

    }
    public void printStudent(){
        System.out.println("ID: "+this.id+" Name: "+this.name);
    }
    public void setStudent2(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void setStudent2(Student2 s){
        this.id=s.id;
        this.name=s.name;
    }
}
public class Homework {
    public static void main(String[] args) {
        Student2 student2=new Student2(100,"Geethma");
        Student2 stu2=new Student2();
        student2.printStudent();
        stu2.printStudent();
        stu2.setStudent2(student2);
        student2.printStudent();
        stu2.printStudent();

    }
}
