/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Denis
 */
public class Table extends Stage {

    public Table() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fx/TableFX.fxml"));

        Scene scene = new Scene(root);

        setTitle("Перечень рейсов корабля");
        setScene(scene);
        show();
    }
}
