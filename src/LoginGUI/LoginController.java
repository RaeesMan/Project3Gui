/**
 * Ra'ees Manuel
 * 219074089
 * LoginController has declaration of buttons
 */

package LoginGUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @FXML
    private ImageView lockImageview;

    @FXML
    private Label myLabel;

    @FXML
    private ComboBox myComboBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
    File LockFile = new File("images/lock.png");
    Image LockImage = new Image(LockFile.toURI().toString());
    lockImageview.setImage(LockImage);

        myLabel.setText("");
        myComboBox.getItems().add("Sign in with company account?");
        myComboBox.getItems().add("Sign in with student account?");
        myComboBox.setPromptText("Select method of signing in");
    }
    public void whenComboBoxIsSelected()
    {
        myLabel.setText(myComboBox.getValue().toString());
    }

}
