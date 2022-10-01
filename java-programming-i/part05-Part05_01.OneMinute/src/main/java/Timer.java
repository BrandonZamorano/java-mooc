/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Timer {

    private ClockHand centiSeconds;
    private ClockHand seconds;

    public Timer() {
        this.centiSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        centiSeconds.advance();

        if (centiSeconds.value() == 0) {
            seconds.advance();

        }
    }

    public String toString() {
        return String.format("%02d:%02d", seconds.value(), centiSeconds.value());
    }
}
