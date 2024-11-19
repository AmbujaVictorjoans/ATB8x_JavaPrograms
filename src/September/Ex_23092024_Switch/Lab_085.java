package September.Ex_23092024_Switch;

public class Lab_085 {
    public static void main(String[] args) {
        //Interview Question
        char C = 'A';
        switch (C){
            case 'A':
                System.out.println("65");
                break;
            //case 65: --> Duplicate label 65 is thrown as JDK already assigns the ASCI value of A in the first case
            // case 'A' is taken as case '65'
                //System.out.println("65");
               // break;
        }
    }
}
