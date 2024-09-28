package Tasks;

public class Task_03_18thSeptember {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        //Line 5 = a = 10;
        //A = --a = 9; a = 9;
        //B = a++ = 9; a = 10;
        //C = a-- = 10; a = 9;
        //Line 6 will give A+B+C = 9 + 9 + 10 = 28
        //Line 7 will give 9
    }
}
