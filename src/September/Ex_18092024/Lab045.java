package September.Ex_18092024;

public class Lab045 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b; // when byte + byte takes place,// system expects the result to be a stored in a bigger container as Int.
        System.out.println(a+b);
        //byte c = a+b; I get an error message saying 'Cast Type Byte, change expression c type to Int


        char a1 = 'A'; //ASCII Value = 65
        char b1 = 'B'; //ASCII value = 66
        System.out.println(a1); ////This statement will print the character value as A
        System.out.println(b1); //This statement will print the character value as B

        int c1 = a1+b1; //This operation will add the ASCII values of both A and B, value is 131
        //Only when concatenation takes place, the ASCII values are added.
        System.out.println(a1+b1);


    }
}
