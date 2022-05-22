package com.elroykanye.p2personui.scene;

import com.elroykanye.p2personui.MainApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class HelloView {
    private final String title;
    private Scene scene;

    public HelloView() {
        title = "Hello Scene";
        FXMLLoader loader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
        try {
            scene = new Scene(loader.load(), 320, 240);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return this.scene;
    }

    public String getTitle() {
        return title;
    }
}
