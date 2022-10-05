/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author brandonwebdev
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(sensor -> sensor.isOn());
    }

    @Override
    public void setOn() {
        sensors.forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Cannot read when sensor is off");
        }
        
        if (sensors.isEmpty()) {
            throw new IllegalStateException("Cannot read when no sensors have been added");
        }
        
        int averageReadValue = (int) (sensors.stream()
                .mapToInt(s -> s.read())
                .average().getAsDouble());
        
        readings.add(averageReadValue);
        
        return averageReadValue;
    }

}
