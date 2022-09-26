package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.example.nonexaminedassessment.SQLhandling;
import javafx.stage.StageStyle;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class LogInController {

    @FXML private TextField UsernameField;

    @FXML private PasswordField PasswordField;

    @FXML
    public void Login(ActionEvent event){
try{
        if(SQLhandling.LoginSQL(UsernameField.getText(), PasswordField.getText())){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            Scene scene = new Scene(root);

        }
    }catch(Exception e){
    System.out.println(e);
    }
}}
