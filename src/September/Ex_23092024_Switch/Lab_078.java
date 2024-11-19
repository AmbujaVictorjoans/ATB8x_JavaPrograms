package September.Ex_23092024_Switch;

public class Lab_078 {
    public static void main(String[] args) {
        //Long with either wrapper class or conversion to int is supported

        long a11 = 30L;
        switch ((int)a11) {
            case 30:
                System.out.println("The data type is long");
                break;
            default:
                System.out.println("Dont know the value");
                break;

        }

    }
}
