package com.forc.foracadem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import com.forc.foracadem.backend.services.admin.AdminService;
import com.forc.foracadem.backend.services.admin.AdminServiceImp;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class LoginController {
    private Scene scene;
    private Stage stage;
    private Parent root;

    @FXML public TextField email;
    @FXML public TextField password;
    @FXML public Label alert;

    @FXML
    protected void login(ActionEvent event) throws IOException {
        AdminService adminServiceImp = new AdminServiceImp();
        switch (adminServiceImp.login(email.getText(),password.getText())){
            case 0:
                alert.setText("No user found!");
                break;
            case 1:
                root = FXMLLoader.load(MainApplication.class.getResource("home-view.fxml"));
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root, 600, 400);
                stage.setTitle("Foracademy - Home");
                stage.setScene(scene);
                stage.show();
                break;
            case 2:
                alert.setText("Wrong password!");
                break;
        }
    }
}