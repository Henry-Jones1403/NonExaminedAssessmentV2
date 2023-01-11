package com.example.nonexaminedassessment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.example.nonexaminedassessment.UserInfo.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Objects;

public class MainController {

    @FXML
    private AnchorPane SearchAnchor;

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
    public void Search_Button(ActionEvent event) {
        Search.searcher(SearchBar, LastName, FirstName, Email);
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choice.fxml")));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("hello3243");
        }

    }
    @FXML
    public void SearchChoice(AnchorPane SearchAnchor){
        SearchAnchor.setVisible(true);

    }
}
//WHERE LastName = '" + name + "'