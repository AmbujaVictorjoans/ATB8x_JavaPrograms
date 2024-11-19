package September.Ex_23092024_Switch;

public class Lab_079 {
    public static void main(String[] args) {
        //For JDK more than 13
        //we can add multiple value in the case

        int itemCode = 003;
        switch (itemCode) {
            case 001, 002, 005:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004, 006, 007:
                System.out.println("All of them are Mech Gadgets");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
