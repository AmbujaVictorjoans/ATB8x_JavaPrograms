package Tasks;

public class Task07_20thSep_TernaryOp2 {
    public static void main(String[] args) {
        //Ternary Operators to handle multiple conditions.
        //Input → int score = 85
        //String grade →
        // score >= 90 → A
        // score >= 80 → B
        //score >= 70 → C

        int Score = 90;
        String Grade = (Score>=90) ? "A": (Score>=80) ? "B": (Score>=70) ? "C":"F";
        System.out.println("Score is " +Score);
        System.out.println("Grade is " +Grade);

    }
}
