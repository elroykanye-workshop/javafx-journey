package com.elroykanye.p1helloworld;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.beans.binding.When;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        text.setOnMouseClicked(mouseEvent -> {
            System.out.println(mouseEvent.getSource().getClass());
            RotateTransition rotateTransition = new RotateTransition(
                    Duration.millis(2500), ellipse
            );
            rotateTransition.setToAngle(360);
            rotateTransition.setFromAngle(0);
            rotateTransition.setInterpolator(Interpolator.LINEAR);
            rotateTransition.play();

            text.strokeProperty().bind(new When(rotateTransition.statusProperty()
                            .isEqualTo(Animation.Status.RUNNING))
                    .then(Color.GREEN).otherwise(Color.RED));
        });

        text.rotateProperty().bind(ellipse.rotateProperty());


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