package com.example.doctorhouse;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeGController {

    @FXML
    private Button home;

    @FXML
    private Button notification;

    @FXML
    private Button prescription;

    @FXML
    void goToHome(ActionEvent event) {
    }

    @FXML
    void goToNotification(ActionEvent event) {

    }

    @FXML
    void goToPrescription(ActionEvent event) {

    }

    public void openHome(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("homepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }
}
