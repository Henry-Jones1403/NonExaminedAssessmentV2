package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private Label username_label;

@FXML
    public void Search_Button(ActionEvent event){
    ArrayList <String> sql = SQLhandling.search("SELECT * FROM Accounts", )
    username_label.setVisible(true);
    username_label.setText("Hello Mohammed");
}
}