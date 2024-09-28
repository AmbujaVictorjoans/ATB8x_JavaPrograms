package Tasks;

public class Task_04_18thSeptember {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a-- + a--);
        System.out.println(a);

        //Line 5 --> a = 10;
        // A = a-- = 10; a = 9;
        // B = a-- = 9; a = 8;
        // C = a-- = 8; a = 7;
        // Line 6 will print A + B + C = 10 + 9 + 8 = 27
        //Line 7 will print 7
    }
}
