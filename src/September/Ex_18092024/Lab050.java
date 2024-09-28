package September.Ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        //GST = 18.45
        int course = 10000;
        float GST = 18.45f;
        //int total_price = course + GST; Narrowing Implicitly throws an error by JVM
        float total_price = course + GST;//Widening
        System.out.println(total_price);
        int total_price1 = course + (int)GST; //Explicitly narrowing, hence JVM will perform the operation
        // but with a data loss
        System.out.println(total_price1);

    }
}
