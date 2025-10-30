import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;

public class MainFormController {

    public RadioButton rdBtnMale;
    public RadioButton rdBtnFemale;

    public void printGenderOnAction(ActionEvent actionEvent) {
        /*if (rdBtnMale.isSelected()){
            System.out.println("Male");
        }
        if (rdBtnFemale.isSelected()){
            System.out.println("Female");
        }*/

        System.out.println(rdBtnMale.isSelected()?"Male":"Female");
    }
}
