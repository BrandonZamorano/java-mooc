
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brandonwebdev
 */
public class BirdDatabase {

    private ArrayList<BirdEntry> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    public void addBird(BirdEntry bird) {
        birds.add(bird);
    }

    public BirdEntry findBirdByName(String name) {
        for (BirdEntry bird : birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
    public void addObservation(String birdName) {
        BirdEntry bird = findBirdByName(birdName);
        
        if (bird != null) {
            bird.addObservation();
            return;
        }
        
        
    }

    public ArrayList<BirdEntry> getBirds() {
        return birds;
    }

}
