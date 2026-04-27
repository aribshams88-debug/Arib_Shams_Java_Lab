// Grader class
class Grader {
    private int score;

    // Constructor
    public Grader(int score) {
        this.score = score;
    }

    // Method to return letter grade
    public char letterGrade() {
        if (score >= 90)
            return 'O';   // Outstanding
        else if (score >= 80)
            return 'E';   // Excellent
        else if (score >= 70)
            return 'A';
        else if (score >= 60)
            return 'B';
        else if (score >= 50)
            return 'C';
        else
            return 'F';
    }
}

// Demo class
import java.util.Scanner;

public class GraderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        // Input and validation
        while (true) {
            System.out.print("Enter score (0–100): ");
            score = sc.nextInt();

            if (score >= 0 && score <= 100)
                break;
            else
                System.out.println("Invalid input! Please enter a value between 0 and 100.");
        }

        // Create object
        Grader g = new Grader(score);

        // Get and print grade
        char grade = g.letterGrade();
        System.out.println("Letter Grade: " + grade);

        sc.close();
    }
}