module com.forc.foracadem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.forc.foracadem to javafx.fxml;
    exports com.forc.foracadem;
}