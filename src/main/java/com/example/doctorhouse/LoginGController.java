package com.example.doctorhouse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginGController implements Initializable {

        @FXML
        private TextField email;
        @FXML
        private TextField password;

        @FXML
        private Label errorlabel;


        @FXML
        void delete(ActionEvent event) {
                email.setText("");
                password.setText("");
        }

        @FXML
        void login(ActionEvent event) throws IOException {
            LoginController login = new LoginController(email.getText(), password.getText());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            if(login.validate()) { //manda messaggio al controller dell'homepage
                    HomeGController home = new HomeGController();
                    home.openHome(stage);
            }else{
                    errorlabel.setVisible(true);
            }
        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                errorlabel.setManaged(false);
                errorlabel.setVisible(false);
                errorlabel.managedProperty().bind(errorlabel.visibleProperty());
        }
}
