import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFormController {

    public ComboBox<String> cmbLanguages;

    ArrayList<String> languages=new ArrayList<>(
            Arrays.asList("Java","JS","PHP","KOTLIN")
    );
    public void initialize(){
        for (String lang:languages
             ) {
            cmbLanguages.getItems().add(lang);
        }
    }

}
