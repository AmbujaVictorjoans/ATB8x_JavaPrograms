package September.Ex_23092024_Switch;

public class Lab_073 {
    public static void main(String[] args) {
        //Switch condition
        //Days 1 to 7
        // 1-  mon, 2= tues, ....7 = Sunday
        //Removing half of the breaks

        int day = 2;
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
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }
    }
}

