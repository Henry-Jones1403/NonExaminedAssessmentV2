package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LogInController {

    @FXML private TextField UsernameField;

    @FXML
    public void Login(ActionEvent e){
        System.out.println(UsernameField.getText());
    }
}
