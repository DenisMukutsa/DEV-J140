/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.models.DataBaseConnection;
import com.example.models.ShipRunRegister;
import com.example.stage.Note;
/**
 *
 * @author Denis
 */
public class TableControl implements Initializable {
    @FXML
    TableView table;
    @FXML
    TableColumn<ShipRunRegister, Integer> id;
    @FXML
    TableColumn<ShipRunRegister, String> departurePort;
    @FXML
    TableColumn<ShipRunRegister, String> arrivalPort;
    @FXML
    TableColumn<ShipRunRegister, Date> departureDate;
    @FXML
    TableColumn<ShipRunRegister, Date> arrivalDate;
    @FXML
    TableColumn<ShipRunRegister, String> cargoType;


    @FXML
    private void buttonActionUpdate(ActionEvent event) {
        updateTable();
    }

    @FXML
    private void buttonActionNote(ActionEvent event) {
        try {

            Note note = new Note();
        } catch (IOException ex) {
            Logger.getLogger(TableControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    @FXML
    private void buttonOut(ActionEvent event) {
        exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void updateTable(){
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        departurePort.setCellValueFactory(new PropertyValueFactory<>("departurePort"));
        arrivalPort.setCellValueFactory(new PropertyValueFactory<>("arrivalPort"));
        departureDate.setCellValueFactory(new PropertyValueFactory<>("departureDate"));
        arrivalDate.setCellValueFactory(new PropertyValueFactory<>("arrivalDate"));
        cargoType.setCellValueFactory(new PropertyValueFactory<>("cargoType"));
        table.setItems(DataBaseConnection.getList());
    }
}
