module com.elroykanye.p1helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.elroykanye.p1helloworld to javafx.fxml;
    exports com.elroykanye.p1helloworld;
}