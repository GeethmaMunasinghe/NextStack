import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DashboardFormController {

    public AnchorPane cntxtWindow;

    public void OpenWindowAOnAction(ActionEvent actionEvent) throws IOException {
        setUI("WindowAForm");
    }

    public void OpenWindowBOnAction(ActionEvent actionEvent) throws IOException {
        setUI("WindowBForm");
    }

    private void setUI(String location) throws IOException {
        cntxtWindow.getChildren().clear();
        cntxtWindow.getChildren().add(
                FXMLLoader.load(getClass().getResource(location+".fxml"))
        );
    }
}
