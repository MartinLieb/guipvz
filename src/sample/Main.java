package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button btZ = new Button("Attack zombie");
        Button btP = new Button("Attack plant");
        Pane pane = new Pane();
        String[] farver = ("red", "green", "yellow", "blue");
        for (int i = 0; i < ; i++) {
            double r = (double) Math.random()*10%4
            Circle circle = new Circle();
            circle.setRadius(20);
            circle.setCenterX(100);
            circle.setCenterY(100);
            circle.setFill(Paint.valueOf());
        }
        pane.getChildren().add(circle);
        pane.getChildren().add(btZ);
        pane.getChildren().add(btP);
        Scene sceneP = new Scene(pane,200,250);
        Scene sceneZ = new Scene(btZ,200,250);
        primaryStage.setTitle("Nu er jeg i gang med GUI, yep");
        primaryStage.setScene(sceneP);
        primaryStage.show();
        Stage stage = new Stage();
        stage.setScene(sceneZ);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
