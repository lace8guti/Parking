module com.mycompany.projecteparking {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projecteparking to javafx.fxml;
    exports com.mycompany.projecteparking;
}
