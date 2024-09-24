package September.Ex_13092024;

public class Lab019 {
    public static void main(String[] args) {
        //Problem Statement - Print a table of 2
        //Use String Formatting

        int num = 2;
        //%d - any integer, byte, long, short
        //%s - String
        //%c - Char
        //%f - float, double

        System.out.printf("Value of %d", num);
        //printf - a convenience way to write a formatted string
        System.out.println();
        System.out.printf("%d * %d = %d", num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d", num,2,num*2);
    }
}
