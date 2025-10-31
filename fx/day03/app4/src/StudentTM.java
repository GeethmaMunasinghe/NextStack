import javafx.scene.control.Button;

public class StudentTM {
    private String nic;
    private String name;
    private int age;
    private Button btn; //ctrl+alt+shift+t

    public StudentTM() {
    }

    public StudentTM(String nic, String name, int age, Button btn) {
        this.nic = nic;
        this.name = name;
        this.age = age;
        this.btn = btn;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
