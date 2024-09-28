package September.Ex_18092024;

public class Lab056 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //Line 5 --> a = 10;
        //Line 6 --> A = ++a = 11; B = a++ = 11; a = 12; C= a++ = 12
        //Line 6 --> wil print A + B + C = 11 + 11 + 12 = 34
        //Line 7 --> a = 13
    }
}
