module com.example.practise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practise to javafx.fxml;
    exports com.example.practise;
}