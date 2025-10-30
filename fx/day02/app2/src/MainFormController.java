import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtInput;
    public TextField txtAnswer;

    /*MainFormController(){

      }*/
    public void initialize(){
        txtInput.textProperty().addListener(((observable, oldValue, newValue) -> {
            /*System.out.println("Old: "+oldValue);
            System.out.println("New: "+newValue);*/

            txtAnswer.setText(newValue);
        }));
    }
}
