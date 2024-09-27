package September.Ex_16092024;

public class Lab035_Relational_Operators {
    public static void main(String[] args) {
        //Relational Operators = boolean
        // > , < , >= , <=, !, != --> True or False
        //They give us a relation and the output is always true or false

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age1 = 34;
        int age2 = 34;
        boolean result  = age1 > age2;
        boolean result1 = age1 >= age2; // OR Gate is applied.
        // age1 > age2; age1 = age2 (both are checked) either one should be true

        System.out.println(result);
        System.out.println(result1);

    }
}
