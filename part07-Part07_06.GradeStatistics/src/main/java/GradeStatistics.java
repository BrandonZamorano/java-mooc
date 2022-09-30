
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

    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }

    public void addGradeFromPoint(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        grades.add(new Grade(point));
    }

    public double getPointAverage() {
        int sum = 0;

        for (Grade grade : grades) {
            sum += grade.getPointScore();
        }

        return 1.0 * sum / grades.size();
    }

    public double getPassingGradePointAverage() {
        int sum = 0;
        int MIN_PASSING_GRADE = 50;
        int numPassing = 0;

        for (Grade grade : grades) {
            if (grade.getPointScore() < MIN_PASSING_GRADE) {
                continue;
            }

            sum += grade.getPointScore();
            numPassing++;
        }

        return 1.0 * sum / numPassing;
    }
}
