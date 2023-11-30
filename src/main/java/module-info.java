module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.demo5 to javafx.fxml, com.google.gson;
    exports com.example.demo5;
}