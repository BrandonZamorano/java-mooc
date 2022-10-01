
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

    public void remove(String storageUnit, String item) {
        ArrayList<String> itemsInUnit = storageUnits.getOrDefault(storageUnit, new ArrayList<>());
        //removes one of the given items from the given storage unit
        itemsInUnit.remove(item);

        // if the storage unit would be empty after removal, remove storage unit.
        if (itemsInUnit.isEmpty()) {
            storageUnits.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyStorageUnits = new ArrayList<>();
        for (String storageUnit : storageUnits.keySet()) {
            if (storageUnits.get(storageUnit).isEmpty()) {
                continue;
            }
            nonEmptyStorageUnits.add(storageUnit);
        }
        
        return nonEmptyStorageUnits;
    }
}
