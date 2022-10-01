
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.getOrDefault(licensePlate, "").isEmpty()) {
            return false;
        }

        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            return false;
        }

        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersAlreadyPrinted = new ArrayList<>();

        for (String owner : registry.values()) {
            if (ownersAlreadyPrinted.contains(owner)) {
                continue;
            }
            System.out.println(owner);
            ownersAlreadyPrinted.add(owner);
        }
    }
}
