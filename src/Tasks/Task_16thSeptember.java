package Tasks;

public class Task_16thSeptember {
    public static void main(String[] args) {
        /* 1. Difference between = and  ==?
        *     Answer: = is a assignment Operator and it assigns a right value to a datatype
        * Example: int a = 10; int --> datatype; a --> variable_name; = --> assignment operator; 10 = literal;
        * == is a Relational Operator and it compares two values and gives a true or false result (boolean)
         *Example boolean c = (45 == 45); (Both Assignment and Relational Operator are used here)
         */

        /* 2. byte b = 10; long l = 10l; → How much Byte will be used?
              byte b = 10; 1 Byte, 8 bits of memory will be used
              long l = 10l; 8 Bytes, 64 bits of memory will be used
         */

        /* 3. Another byte b = 10; byte c = 10;
              What is the answer if we perform b+c, What is the data type it will give in result.
               As a rule, when byte + byte will result in a data type as Int.
         */

        /* 4. question
         short s = 10;

        char c = 'A'; //65

        int ss = s+c;

        System.out.println(ss);
         */

        short s = 10;
        char c = 'A'; // ASCII value of A is 65
        int ss = s+c;

        byte b = 10;
        byte d = 10;
        int total = b+d;

        System.out.println(ss);
        System.out.println(total);





    }
}
