import static org.junit.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class CalculatorTest {
    
    @Test
    public void calculatorInitialValueZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getValue());
    }
    
    @Test
    public void valueFiveWhenFiveAdded() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        
        assertEquals(5, calculator.getValue());
    }
    
    @Test
    public void valueMinusTwoWhenTwoSubtracted() {
        Calculator calculator = new Calculator();
        calculator.subtract(2);
        
        assertEquals(-2, calculator.getValue());
            
    }
}
