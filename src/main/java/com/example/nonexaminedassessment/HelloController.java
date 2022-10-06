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

    ArrayList <String> sql = SQLhandling.print("SELECT * FROM Users WHERE FirstName = '" + SearchBar.getText() +"'", "", "");
    try{
        UserInfo Currentuser = new UserInfo(Integer.parseInt(sql.get(0)) , sql.get(1), sql.get(2), sql.get(3), sql.get(4), sql.get(5), Integer.parseInt(sql.get(6)),  sql.get(6));
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