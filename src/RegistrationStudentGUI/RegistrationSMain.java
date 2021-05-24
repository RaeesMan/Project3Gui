/**
 * Ra'ees Manuel
 * 219074089
 * RegistrationSMain has project resolution
 */


package RegistrationStudentGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RegistrationSMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("RegistrationS.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 377, 545));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
