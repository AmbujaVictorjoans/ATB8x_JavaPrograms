package September.Ex_20092024_IfElse1;

public class Lab070 {
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

        int score = 59;

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        }
        else if (score >= 80 && score <=89){
            System.out.println("Grade B");
        }
        else if (score >= 70 && score <=79) {
        System.out.println("Grade C");
        }
        else if (score >= 60 && score<=69){
        System.out.println("Grade D");
        }
        else {
        System.out.println("Grade F"); }

    }
}
