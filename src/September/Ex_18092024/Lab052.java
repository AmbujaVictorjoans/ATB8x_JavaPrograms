package September.Ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        //pre increment operator example

        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line 7 --> the value of 'a' is 10
        //Line 8 --> the value of 'a' is 11, result is 11
        //Line 9 --> will print 11 as 'a' is 11
        //Line 10 --> will print 11 as result is 11


        //Post Increment - Example

        int b = 18;
        int result1 = b++;
        System.out.println(b);
        System.out.println(result1);

        //Line 20 --> value of b is 18
        //Line 21 --> value of result1 is 18, value of b is 19
        //Line 22 --> will return 19 as b has been incremented to 19
        //Line 23 --> result1 will return 18
    }
}
