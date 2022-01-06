package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import services.admin.AdminService;
import services.admin.AdminServiceImp;

import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {
    @FXML
    private Button btnconnx;

    @FXML
    private PasswordField textMotpss;

    @FXML
    private Rectangle textPass;

    @FXML
    private TextField txtEmail;

    @FXML
    void login(ActionEvent event) {
        //JOptionPane.showMessage();
        /*username = txtEmail.getText();
        password = textMotpss.getText();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql;

        sql = "SELECT * FROM users WHERE Inlognaam = 1 AND Wachtwoord = 2";
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery(sql);

        if (!resultSet.next()) {
            labeltxt.setText("Login Failed");
        } else {
            Parent root1 = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Stage secondarystage = new Stage();
            secondarystage.setScene(new Scene(root1));
            secondarystage.show();
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
        }
        txtEmail.setText("");
        textMotpss.setText("");

         */
        AdminService adminService = new AdminServiceImp();
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
