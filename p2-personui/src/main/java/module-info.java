module com.elroykanye.p2personui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.elroykanye.p2personui to javafx.fxml;
    exports com.elroykanye.p2personui;
}