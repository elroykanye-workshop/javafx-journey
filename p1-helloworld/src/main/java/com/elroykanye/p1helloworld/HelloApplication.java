package com.elroykanye.p1helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        loadSimpleShapeView(stage);
    }

    public void loadHelloView(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello Modern World!");
        stage.setScene(scene);
        stage.show();
    }

    public void loadSimpleShapeView(Stage stage) {
        // create an ellipse and set fill color
        Ellipse ellipse = new Ellipse(110, 70);
        ellipse.setFill(Color.LIGHTBLUE);

        // create a text shape with font and size
        Text text = new Text("My Shapes");
        text.setFont(new Font("Arial Bold", 24));

        // stack pane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, text);

        // set scene
        stage.setScene(new Scene(stackPane, 350, 230, Color.LIGHTYELLOW));

        stage.setTitle("My Shapes with JFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}