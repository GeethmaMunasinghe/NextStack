import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtName;

    public void printNameOnAction(ActionEvent actionEvent) {
        String name=txtName.getText();
        System.out.println(name);
    }
}
