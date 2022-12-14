
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
public class GradeStatistics {

    private ArrayList<Grade> grades;
    private ArrayList<Grade> passingGrades;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }

    public void addGradeFromPoint(int point) {
        if (point < 0 || point > 100) {
            return;
        }

        int MIN_PASSING_GRADE = 50;

        Grade grade = new Grade(point);
        if (point >= MIN_PASSING_GRADE) {
            passingGrades.add(grade);
        }
        grades.add(grade);

    }

    public double getPointAverage() {
        int sum = 0;

        for (Grade grade : grades) {
            sum += grade.getPointScore();
        }

        return 1.0 * sum / grades.size();
    }

    public double getPassingGradePointAverage() {
        if (passingGrades.isEmpty()) {
            return -1;
        }

        int sum = 0;

        for (Grade grade : passingGrades) {
            sum += grade.getPointScore();
        }

        return 1.0 * sum / passingGrades.size();
    }

    private ArrayList<Grade> getPassingGrades() {
        return passingGrades;
    }

    public double getPassPercentage() {
        if (passingGrades.isEmpty()) {
            return 0;
        }
        
        return 100.0 * passingGrades.size() / grades.size();
    }
    
    public int[] getGradeDistribution() {
        int[] gradeDistribution = new int[6];
        
        for (Grade grade : grades) {
            gradeDistribution[grade.getGrade()]++;
        }
        
        return gradeDistribution;
    }
    
    private String getGradeDistributionString() {
        String output = "";
        int[] gradeDistribution = getGradeDistribution();
        
        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            output+= i + ": " + getStar(gradeDistribution[i]) + "\n";
        }
        
        return output;
    }
    
    private String getStar(int numStars) {
        String stars = "";
        for (int i = 0; i < numStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public String toString() {
        String output = "";
        output += "Point average (all): " + getPointAverage();
        double passingGPA = getPassingGradePointAverage();
        output += "\nPoint average (passing): " + (passingGPA == -1 ? "-" : passingGPA);
        output += "\nPass percentage: " + getPassPercentage();
        output += "\nGrade distribution:\n" + getGradeDistributionString();
        
        return output;
    }
}
