package Tasks;

public class Task02_23rdSeptember {
    public static void main(String[] args) {
        //Write a program that takes an integer input (1 - 12) and prints the name of the corresponding month
        //using a switch statement

        int num = 7;
        switch (num){
            case 1 -> System.out.println("Month: January");
            case 2 -> System.out.println("Month: February");
            case 3 -> System.out.println("Month: March");
            case 4 -> System.out.println("Month: April");
            case 5 -> System.out.println("Month: May");
            case 6 -> System.out.println("Month: June");
            case 7 -> System.out.println("Month: July");
            case 8 -> System.out.println("Month: August");
            case 9 -> System.out.println("Month: September");
            case 10 -> System.out.println("Month: October");
            case 11 -> System.out.println("Month: November");
            case 12 -> System.out.println("Month: December");
            default -> System.out.println("Month does not exist");

        }
    }
}
