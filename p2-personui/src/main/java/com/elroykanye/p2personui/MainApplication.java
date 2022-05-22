package com.elroykanye.p2personui;

import com.elroykanye.p2personui.scene.HelloView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) {
        HelloView helloView = new HelloView();
        Scene scene = helloView.getScene();


        stage.setTitle(helloView.getTitle() + " - Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}