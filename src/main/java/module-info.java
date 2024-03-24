module com.blue32.blue32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.blue32.blue32 to javafx.fxml;
    exports com.blue32.blue32;
}