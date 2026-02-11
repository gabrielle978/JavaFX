module br.com.dio.javafx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio.javafx1 to javafx.fxml;
    exports br.com.dio.javafx1;
    exports controller;
    opens controller to javafx.fxml;
}