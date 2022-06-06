/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.example.models.DataBaseConnection;
import com.example.setting.Setting;
/**
 *
 * @author Denis
 */
public class NoteControl implements Initializable {
    Label infoLabel;
    @FXML
    public TextField departurePortField;
    @FXML
    public TextField arrivalPortField;
    @FXML
    public TextField departureDateField;
    @FXML
    public TextField arrivalDateField;
    @FXML
    public TextField cargoTypeField;

    @FXML
    private void buttonAction(ActionEvent event) {
        String departurePortText = departurePortField.getText();
        String arrivalPortText = arrivalPortField.getText();
        String departureDateText = departureDateField.getText();
        String arrivalDateText = arrivalDateField.getText();
        String cargoTypeText = cargoTypeField.getText();


        if(departurePortText.trim().isEmpty()
                || arrivalPortText.trim().isEmpty()
                || departureDateText.trim().isEmpty()
                || arrivalDateText.trim().isEmpty()
                || cargoTypeText.trim().isEmpty())
        {infoLabel.setText("Заполните все поля");}
        else{
            Setting setting = new Setting();
            try (Connection connection = DriverManager.getConnection(
                    setting.getValue(Setting.URL),
                    setting.getValue(Setting.USE),
                    setting.getValue(Setting.PASS));){
                Statement stm = connection.createStatement();
                String sql = "INSERT INTO ShipRunRegister"
                        + "(departurePort, destinationPort, departureDate, arrivalDate, cargoType) "
                        + "VALUES ('" + departurePortText + "', '"
                        + arrivalPortText + "', '"
                        + departureDateText + "', '"
                        + arrivalDateText + "', '"
                        + cargoTypeText + "')";

                stm.executeUpdate(sql);

            } catch (SQLException ex) {
                Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*infoLabel.setText("OK");*/}
        System.out.println("Добавлено");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
