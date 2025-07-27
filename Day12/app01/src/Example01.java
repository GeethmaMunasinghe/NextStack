
class Student{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
public class Example01 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Geethma");
        student.setAge(24);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

}
