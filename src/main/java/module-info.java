module com.example.devj140 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.devj140 to javafx.fxml;
    exports com.example.devj140;
}