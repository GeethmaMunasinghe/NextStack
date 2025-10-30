import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {
    public TextField txtName;

    public void printNameOnAction(ActionEvent actionEvent) {
        String name=txtName.getText();
        System.out.println(name);
    }

    public void onKeyPressed(KeyEvent keyEvent) {
        System.out.println(txtName.getText());
    }
}
