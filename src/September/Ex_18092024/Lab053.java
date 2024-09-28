package September.Ex_18092024;

public class Lab053 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        //Line 5 --> Value of a is 10
        //Line 6 --> Value of a++ is 10;
        //Line 6 --> Value of a becomes 11, a++ + a will print 10+11 = 21

        System.out.println(++a + a);
        //Now the value of a is 11; ++a will make it 12, so a = 12
        //Line 12 will be 12 + 12 = 24

    }
}
