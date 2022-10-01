/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonwebdev
 */
public class Grade {
    private int pointScore;
    private int grade;
    
    public Grade(int pointScore) {
        this.pointScore = pointScore;
        this.grade = getGradeFromPoint(pointScore);
    }

    public int getPointScore() {
        return pointScore;
    }

    public int getGrade() {
        return grade;
    }
    
    private int getGradeFromPoint(int pointScore) {
        int grade = 0;
        
        if (pointScore < 50) {
            grade = 0;
        } else if (pointScore < 60) {
            grade = 1;
        } else if (pointScore < 70) {
            grade = 2;
        } else if (pointScore < 80) {
            grade = 3;
        } else if (pointScore < 90) {
            grade = 4;
        } else if (pointScore >= 90) {
            grade = 5;
        }
        
        return grade;
    }
    
    
    
}
