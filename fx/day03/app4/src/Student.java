public class Student {
    private String nic;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String nic, String name, int age) {
        this.nic = nic;
        this.name = name;
        this.age = age;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
