import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] courses = {"Math", "English", "Physics", "Programming"};
        double[] scores = new double[4];
        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }
        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for (double s : scores) {
            if (s > max) max = s;
            if (s < min) min = s;
            sum += s;
        }
        double average = sum / scores.length;
        StringBuilder maxCourses = new StringBuilder();
        StringBuilder minCourses = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                if (maxCourses.length() > 0) maxCourses.append(" and ");
                maxCourses.append(courses[i]);
            }
            if (scores[i] == min) {
                if (minCourses.length() > 0) minCourses.append(" and ");
                minCourses.append(courses[i]);
            }
        }
        System.out.println();
        System.out.println("Output:");
        System.out.println("Max score is: " + max + " (" + maxCourses + " courses).");
        System.out.println("Min score is: " + min + " (" + minCourses + " courses).");
        System.out.println("Average score of this student is: " + average);
        input.close();
    }
}