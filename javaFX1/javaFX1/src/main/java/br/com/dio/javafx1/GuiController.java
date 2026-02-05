package br.com.dio.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import util.Alerts;

public class GuiController {
    @FXML
    private Button btn;

    //method to test if its working
//    @FXML
//    public void onBtnAction(){
//        System.out.println("you clicked me");
//    }

    //method to show a prompt alert
    @FXML
    public void onBtnAlertAction(){
        Alerts.showAlert("Alert title", "Alert header", "Alert content", Alert.AlertType.WARNING);
    }
}
