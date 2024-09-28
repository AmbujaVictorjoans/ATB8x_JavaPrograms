package Tasks;

public class Task_01_Narrowing_18thSeptember {
    public static void main(String[] args) {
        //Narrowing with implicit and explicit.
        double mark1 = 87.5;
        double mark2 = 80.5;
        double mark3 = 82.75;
        double total_marks = mark1+ mark2 + mark3;
        //int average = total_marks/3; Implicit Narrowing which JVM doesnt allow
        int average = (int)total_marks / 3; // Explicit narrowing from double to int
        System.out.println(total_marks);
        System.out.println(average);
        double avg_with_dec = total_marks / 3; // Without Narrowing
        System.out.println(avg_with_dec);
    }
}
