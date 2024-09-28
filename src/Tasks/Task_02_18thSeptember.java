package Tasks;

public class Task_02_18thSeptember {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a-- + a--);
        System.out.println(a);
        //A = --a = 9; a = 9;
        //B = a-- = 9; a = 8;
        //C = a-- = 8; a = 7;
        //Line 6 will give A + B + C = 9 + 9 + 8 = 26
        //Line 7 will give 7
    }
}
