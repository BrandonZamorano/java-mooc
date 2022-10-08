
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Pipe<T> {
    List<T> values;
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        if (values.isEmpty()) {
            return null;
        }
        
        return values.remove(0);
    }
    
    public boolean isInPipe() {
        return !this.values.isEmpty();
    }
}
