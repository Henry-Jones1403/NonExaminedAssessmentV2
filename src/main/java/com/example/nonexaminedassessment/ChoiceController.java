package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class ChoiceController {

@FXML
    private Label Choice1;

@FXML
    private Label Choice2;

@FXML
    private Label Choice3;


    public void decisionLauncher() {
        try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choice.fxml")));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setFullScreen(true);
                stage.setScene(scene);
                stage.show();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("hello3243");
        }
    }
}
