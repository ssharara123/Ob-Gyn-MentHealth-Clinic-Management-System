module com.example.clinic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.clinic to javafx.fxml, javafx.base;
    exports com.example.clinic;
    opens com.example.Model to javafx.fxml,javafx.base;
    exports com.example.Model;
}