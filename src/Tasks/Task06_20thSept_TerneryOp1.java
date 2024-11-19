package Tasks;

public class Task06_20thSept_TerneryOp1 {
    public static void main(String[] args) {
        //Maximum of three numbers using Ternary Operator
        int a = 50;
        int b = 80;
        int c = 90;

        int max1 = (a>b && a>c)? a : b;
        int max2 = (b>c && b>a)? b : c;
        int max3 = (max1 > max2)? max1 : max2;
        System.out.println(max3);


    }
}
