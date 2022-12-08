package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.example.nonexaminedassessment.UserInfo.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private Label username_label;

    @FXML
    private TextField SearchBar;

@FXML
private Label FirstName;
    @FXML
    private Label LastName;
    @FXML
    private Label Email;

@FXML
    public void Search_Button(ActionEvent event){
    String name = "Jones";

    ArrayList <UserInfo> sql = SQLhandling.print("SELECT * FROM Users WHERE FirstName = '" + SearchBar.getText() +"'", "", "");

    try{
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
//WHERE LastName = '" + name + "'