package com.example.affectations;

import com.example.affectations.models.Employe;
import com.example.affectations.utils.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("/employe.fxml"));
        primaryStage.setTitle("Gestion des Employés");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();*/
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("employe.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}