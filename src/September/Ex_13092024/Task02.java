package September.Ex_13092024;

public class Task02 {
    public static void main(String[] args) {
        //Prepare a small calculator which supports
        //+, -, *, /, and % (modulus operator)

        double a = 34;
        double b = 20;
        double c = a+b;
        double d = a-b;
        double e = a*b;
        double f = a/b;
        double g = a%b;

        //First Operation -- a + b
        System.out.println( "First Operation is Addition");
        System.out.println("a+b = " + c);
        // Second Operation -- a - b
        System.out.println( "Second Operation is Subtraction");
        System.out.println("a-b = " + d);
        // Third Operation -- a * b
        System.out.println( "Third Operation is Multiplication");
        System.out.println("a*b = " + e);
        //Fourth Operation -- a/b
        System.out.println( "Fourth Operation is Division");
        System.out.println("a/b = " + f);
        //Fifth Operation -- a%b
        System.out.println( "Fourth Operation is Modulus");
        System.out.println("a%b = " + g); // Modulus in Java is used to find the Remainder


    }
}
