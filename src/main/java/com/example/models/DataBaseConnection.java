/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.example.setting.Setting;
/**
 *
 * @author Denis
 */
public class DataBaseConnection {

    public static ObservableList<ShipRunRegister> getList(){
        List<ShipRunRegister> register = new ArrayList<>();
        Setting settings = new Setting();

        try (Connection connection = DriverManager.getConnection(settings.getValue(Setting.URL),
                settings.getValue(Setting.USE),
                settings.getValue(Setting.PASS));){
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM ShipRunRegister");
            ShipRunRegister rout = null;
            while (rs.next()) {
                rout = new ShipRunRegister(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getString(5));
                register.add(rout);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return FXCollections.observableArrayList(register);
    }
}

