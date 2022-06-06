/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.models;

import java.sql.Date;

/**
 *
 * @author Denis
 */
public class ShipRunRegister {
    private String departurePort;
    private String destinationPort;
    private Date departureDate;
    private Date arrivalDate;
    private String cargoType;

    public ShipRunRegister(String departurePort, String destinationPort, Date departureDate, Date arrivalDate, String cargoType) {
        this.departurePort = departurePort;
        this.destinationPort = destinationPort;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.cargoType = cargoType;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public String toString() {
        return "Routs{" + "departurePort = " + departurePort + ", destinationPort = " + destinationPort + ", departureDate = " + departureDate + ", arrivalDate = " + arrivalDate + ", cargoType = " + cargoType + '}';
    }

}
