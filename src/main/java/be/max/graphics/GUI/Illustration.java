package be.max.graphics.GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Illustration extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Cellular Automata");

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(5);
        Group root = new Group(rectangle);
        rectangle.setFill(Color.BLUE);
        Scene scene = new Scene(root,600, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
