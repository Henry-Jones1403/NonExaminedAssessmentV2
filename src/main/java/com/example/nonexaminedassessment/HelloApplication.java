package com.example.nonexaminedassessment;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import com.example.nonexaminedassessment.SQLhandling;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application{

    double x = 0;
    double y = 0;

    @Override
    public void start(Stage stage) {
        try{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.DECORATED);

        root.setOnMousePressed(evt ->{
            x = evt.getSceneX();
            y = evt.getSceneY();
        });
        root.setOnMouseDragged((evt -> {
            stage.setX(evt.getScreenX()-x);
            stage.setY(evt.getScreenY()-y);
        }));
        stage.setScene(scene);
        stage.show();
    }catch(Exception e){
            System.out.println(e);}
    }



    public static void main(String[] args) {
        launch();
    }
}