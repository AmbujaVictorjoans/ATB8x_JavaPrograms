package September.Ex_23092024_Switch;

public class Lab_080 {
    public static void main(String[] args) {
        //usage of arrow in case
        //this -> eliminates break statement

        int itemCode = 007;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002, 006 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hellooo");
        }
    }
}
