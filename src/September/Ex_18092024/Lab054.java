package September.Ex_18092024;

public class Lab054 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        //Line 5 --> a = 10;
        //Line 6 --> a++ is 10, a = 11, ++a = 12 (11 + 1 = 12)
        //Line 6 will print --> 10+12 = 22

        // can be done like this
        // A = a++ --> 10; value of a becomes 11
        //Operator = +
        // B = ++a --> 11+ 1 = 12, a = 12, B = 12
        //Now A+B = 10+12 = 22
        System.out.println(a);
        //Line 10 --> a value is 12

    }
}
