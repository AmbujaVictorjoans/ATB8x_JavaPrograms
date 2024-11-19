package September.Ex_23092024_Switch;

public class Lab_074 {
    public static void main(String[] args) {
        //Removing all breaks
        //all cases will be executed

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No idea, what day it is");
        }
    }
}
