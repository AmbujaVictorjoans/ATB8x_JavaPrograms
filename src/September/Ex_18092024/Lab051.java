package September.Ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        //Increment (++) Operators
        //Decrement (--) Operators

        //There are two types of increment operators
        // Pre and Post Increment
        // Value is incremented first and then stored in the result

        int a = 10;
        int b = ++a; //++a means a = a+1

        System.out.println(b); //This will give a value of 11 (as value is incremented and printed)
        System.out.println(a); //This will also give you a value of 11

        int c = 12;
        System.out.println(++c); // This will result in 13 (as value is incremented and printed)
        System.out.println(c);


        //Post Increment
        //Print First and then increase
        int a_post = 10;
        System.out.println(a_post++); //Value will get printed first and then incremented
        System.out.println(a_post); //Value has been incremented
    }
}
