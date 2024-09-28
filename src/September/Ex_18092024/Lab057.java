package September.Ex_18092024;

public class Lab057 {
    public static void main(String[] args) {
        int a = 10;
        int result = a--;
        System.out.println(a);
        System.out.println(result);

        // Line 5 --> a = 10;
        // Line 6 --> result = a-- = 10, a = 9
        // Since its a post decrement operator, exp a-- takes the value of a as 10 and then decrements by 1
        // So the Exp is 10; a is 9

        int b = 16;
        int result1 = --b;
        System.out.println(b);
        System.out.println(result1);
        //Line 15 --> b = 16;
        //Line 16 --> result1 = --b = 15; b = 15
        //Line 17 will print 15
        //Line 18 will also print 15
    }
}
