
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand {
    private List<Card> cardsInHand;
    
    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cardsInHand.add(card);
    }
    
    public void print() {
        cardsInHand.forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cardsInHand);
    }
}
