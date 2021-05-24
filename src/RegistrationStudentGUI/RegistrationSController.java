/**
 * Ra'ees Manuel
 * 219074089
 * RegistrationSController has declaration of buttons
 */


package RegistrationStudentGUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;


import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationSController implements Initializable
{
    @FXML
    private ImageView RegisterImageview;

    @FXML
    private Label myLabel;

    @FXML
    private ComboBox myComboBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        File RegisterFile = new File("images/register.png");
        Image RegisterImage = new Image(RegisterFile.toURI().toString());
        RegisterImageview.setImage(RegisterImage);

        myLabel.setText("");
        myComboBox.getItems().add("Computer Science");
        myComboBox.getItems().add("Engineering");
        myComboBox.getItems().add("Law");
        myComboBox.getItems().add("Medicine");


    }
    public void whenComboBoxIsSelected()
    {
        myLabel.setText(myComboBox.getValue().toString());
    }

}
