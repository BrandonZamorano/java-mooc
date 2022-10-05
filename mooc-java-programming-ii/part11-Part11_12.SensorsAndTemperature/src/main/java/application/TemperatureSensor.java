/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author brandonwebdev
 */
public class TemperatureSensor implements Sensor {

    private boolean status;

    public TemperatureSensor() {
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Cannot read temperature data when sensor is off.");
        }

        return new Random().nextInt(60) - 30;
    }
}
