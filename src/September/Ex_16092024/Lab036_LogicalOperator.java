package September.Ex_16092024;

public class Lab036_LogicalOperator {
    public static void main(String[] args) {
        //Logical Operators
        //Logical AND &&
        //Logical OR ||
        //Logical NOT !

        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        // can be written as
        // boolean c = true && false;
        boolean d = a || b;
        // can be written as
        // boolean d = true || false;
        System.out.println(c); //Logical AND
        System.out.println(d); //Logical OR
        System.out.println(!d); //Logical NOT
        // System.out.println(!true)
    }
}
