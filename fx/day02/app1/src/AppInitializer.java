import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource=getClass().getResource("MainForm.fxml"); //catch
        Parent load= FXMLLoader.load(resource); //load
        Scene scene=new Scene(load); //create scene
        primaryStage.setScene(scene);//set scene into stage
        primaryStage.show(); //show
    }
}
