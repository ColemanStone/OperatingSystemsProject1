module com.example.operatingsystemsproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operatingsystemsproject1 to javafx.fxml;
    exports com.example.operatingsystemsproject1;
}