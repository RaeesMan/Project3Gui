/**
 * Ra'ees Manuel
 * 219074089
 * RegistrationCController has declaration of buttons
 */


package RegistrationCompanyGUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationCController implements Initializable
{


    @FXML
    private ImageView RegisterImageview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        File RegisterFile = new File("images/register.png");
        Image RegisterImage = new Image(RegisterFile.toURI().toString());
        RegisterImageview.setImage(RegisterImage);
    }
}

