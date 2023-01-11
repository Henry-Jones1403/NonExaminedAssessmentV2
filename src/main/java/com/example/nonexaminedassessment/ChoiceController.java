package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Objects;

public class ChoiceController {

@FXML
    private  Label Choice1;

@FXML
    private Label Choice2;

@FXML
    private Label Choice3;


public void outputs(ArrayList<UserInfo> options){
    System.out.println("into the method");
    while(options.size()>1){
        Choice1.setVisible(true);
        Choice1.setText("hello");
        System.out.println("into the while");
    }
}

}
