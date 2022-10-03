package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Search {

    @FXML
    private Label username_label;

    @FXML
    public void Search_Button(ActionEvent event){
        username_label.setText("hello mohammed");
    }

}
