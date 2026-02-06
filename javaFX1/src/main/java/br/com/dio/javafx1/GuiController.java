package br.com.dio.javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerts;

public class GuiController {
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private Label labelResult;
    @FXML
    private Button btnSum;

//    //method to test if its working
//    @FXML
//    public void onBtnAction(){
//        System.out.println("you clicked me");
//    }
//
//    //method to show a prompt alert
//    @FXML
//    public void onBtnAlertAction(){
//        Alerts.showAlert("Alert title", "Alert header", "Alert content", Alert.AlertType.WARNING);
//    }

    @FXML
    public void onBtnSumAction() {
        try {
            double number1 = Double.parseDouble(txtN1.getText());
            double number2 = Double.parseDouble(txtN2.getText());
            double sum = number1+number2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e){
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }

    }
}
