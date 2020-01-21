module com.afpa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.afpa.controllers to javafx.fxml;
    exports com.afpa;
}