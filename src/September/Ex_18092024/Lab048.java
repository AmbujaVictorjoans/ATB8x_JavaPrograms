package September.Ex_18092024;

public class Lab048 {
    public static void main(String[] args) {
        //type casting

        // Two Concepts - Widening and Narrowing
        //Widening - Implicit, Explicit (without any loss of data)
        //Narrowing - Implicit, Explicit (with loss of data)

        //Widening
        byte b = 10;
        int a = b; //Valid Statement
        //Implicit Widening
        //We can store a byte value into an int data type
        //Placing a smaller value into a bigger size memory container
        // JVM converts b to a integer data type implicitly

        int a1 = (int)b; //Valid Statment
        //Explicit Widening
        //We explicitly assign the data type as int.
        //For widening, both implicit and explicit works the same.

        System.out.println(a);
        System.out.println(a1);

        //Narrowing - Placing a bigger size data into a smaller sized memory container.
        // This leads to loss of data

        int val = 300;
        //byte b1 = val; Invalid Statement
        //Implicit Narrowing leads to an error by JVM,
        // JVM insists to change the data type to int
        byte b2 = (byte)val;
        //Explicit Narrowing - where we explicitly mention the data type as byte,
        // thus storing a bigger sized data into a smaller container
        //Whatever data the byte sized container can store, it will store upto its limit,
        //the rest of the data will be lost or truncated

        System.out.println(b2);
    }
}
