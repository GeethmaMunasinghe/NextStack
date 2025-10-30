import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;

import java.util.ArrayList;

public class MainFormController {

    public CheckBox cbxJava;
    public CheckBox cbxRuby;
    public CheckBox cbxKotlin;

    public void printDataOnAction(ActionEvent actionEvent) {
        ArrayList<String> languages=new ArrayList<>();
        if (cbxJava.isSelected())languages.add("Java");
        if (cbxKotlin.isSelected())languages.add("Kotlin");
        if (cbxRuby.isSelected())languages.add("Ruby");

        System.out.println("Languages: "+languages);
    }
}
