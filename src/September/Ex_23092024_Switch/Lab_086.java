package September.Ex_23092024_Switch;

public class Lab_086 {
    public static void main(String[] args) {
        //Concatenation with Char is possible

        char ch = 'C';
        switch (ch){
            case 'A':
                System.out.println("ASCII value of A is 65");
                break;
            case 'A'+1:
                System.out.println("ASCII value of B is 66");
                break;
            case 'B'+1:
                System.out.println("ASCII value of C is 67");
                break;

        }
    }
}
