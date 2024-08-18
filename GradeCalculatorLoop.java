import java.util.Scanner;

public class GradeCalculatorLoop {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int score1 = getScore(input, "Enter Score 1 : ");
        int score2 = getScore(input, "Enter Score 2 : ");
        int score3 = getScore(input, "Enter Score 3 : ");
        int score4 = getScore(input, "Enter Score 4 : ");
        int score5 = getScore(input, "Enter Score 5 : ");
        int scoreA = (score1 + score2 + score3 + score4 + score5) / 5;

        if (scoreA >= 85) {
            System.out.println("The student's average grade is " + scoreA);
            System.out.println("The student's letter grade is A");
        } else if (scoreA >= 75) {
            System.out.println("The student's average grade is " + scoreA);
            System.out.println("The student's letter grade is B");
        } else if (scoreA >= 65) {
            System.out.println("The student's average grade is " + scoreA);
            System.out.println("The student's letter grade is C");
        } else if (scoreA >= 55) {
            System.out.println("The student's average grade is " + scoreA);
            System.out.println("The student's letter grade is D");
        } else {
            System.out.println("The student's average grade is " + scoreA);
            System.out.println("The student's letter grade is F");
        }
    }

    public static int getScore(Scanner input, String prompt) {
        int score;
        do {
            System.out.println(prompt);
            score = input.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Bro Enterrrrrrr 0-100 hey hey boy");
            }
        } while (score < 0 || score > 100);
        return score;
    }
}
