
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;
    
    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storageUnits.putIfAbsent(unit, new ArrayList<>());
        storageUnits.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }
}
