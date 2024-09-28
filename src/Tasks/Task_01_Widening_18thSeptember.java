package Tasks;

public class Task_01_Widening_18thSeptember {
    public static void main(String[] args) {

        short age1 = 89 ;
        int age2 = age1 + 8; //Implicit Widening
        int age3 = (int)age1 + 5; //Explicit Widening
        int age_difference = age2 - age1;
        System.out.println(age_difference);
        int age_sum = (int)age1 + age2 + age3;
        System.out.println(age_sum);
    }
}
