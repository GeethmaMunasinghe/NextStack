import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowBFormController {

    public AnchorPane contextB;

    public void previousWindowOnAction(ActionEvent actionEvent) throws IOException {
        Parent load=FXMLLoader.load(getClass().getResource("WindowAForm.fxml"));
        Stage stage=(Stage) contextB.getScene().getWindow();
        stage.setScene(new Scene(load));
        stage.centerOnScreen();
    }
}
