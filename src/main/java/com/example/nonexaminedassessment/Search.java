package com.example.nonexaminedassessment;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Objects;

public class Search {
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

public static void searcher(TextField SearchBar, Label LastName, Label FirstName, Label Email){
    ArrayList<UserInfo> sql = SQLhandling.print("SELECT * FROM Users WHERE FirstName = '" + SearchBar.getText() +"'", "", "");
    if(sql.size()>1){
        try{
            Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("Choice.fxml")));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setFullScreen(true);
            stage.setScene(scene);
            stage.show();

        }catch(Exception e){
            System.out.println(e);
        }

    }

    try{
        System.out.println(sql.get(0).toString() + " number 1 in output");
        System.out.println(sql.get(1).toString()+ " number 2 in output");
        UserInfo Currentuser = sql.get(0);
        LastName.setVisible(true);
        FirstName.setVisible(true);
        Email.setVisible(true);
        LastName.setText(Currentuser.getLastName());
        FirstName.setText(Currentuser.getFirstName());
        Email.setText(Currentuser.getEmail());
        System.out.println(Currentuser.toString());
    }catch(Exception e){
        System.out.println(e);

    }

}

}
