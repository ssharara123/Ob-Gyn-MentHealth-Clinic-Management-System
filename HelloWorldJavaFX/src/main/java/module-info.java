module com.example.helloworldjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.helloworldjavafx to javafx.fxml;
    exports com.example.helloworldjavafx;
}