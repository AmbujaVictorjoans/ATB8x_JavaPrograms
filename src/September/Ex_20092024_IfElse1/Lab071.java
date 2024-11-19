package September.Ex_20092024_IfElse1;

public class Lab071 {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a Program that calculates and displays the letter grade
        // for a given numerical score based on the
        //following grade scale:
        //A: 90 -100
        //B: 80 - 89
        //C: 70 - 79
        //D: 60 - 69
        //F: 0 - 59

        int score = 101;
        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if ( score <= 0 || score > 100) {
            System.out.println("Invalid Score");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is ---> " + grade);
    }
}
