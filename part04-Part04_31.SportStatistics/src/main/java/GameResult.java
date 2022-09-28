/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class GameResult {

    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;

    public GameResult(String team1Name, String team2Name, int team1Score, int team2Score) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;

        this.team1Score = team1Score;
        this.team2Score = team2Score;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public String getWinner() {
        if (team1Score > team2Score) {
            return team1Name;
        }

        return team2Name;
    }

}
