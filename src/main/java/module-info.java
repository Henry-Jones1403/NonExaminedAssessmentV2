module com.example.nonexaminedassessment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.nonexaminedassessment to javafx.fxml;
    exports com.example.nonexaminedassessment;
}