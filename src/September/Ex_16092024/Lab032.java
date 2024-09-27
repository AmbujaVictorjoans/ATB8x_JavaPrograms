package September.Ex_16092024;

public class Lab032 {
    public static void main(String[] args) {
        String First_Name = "Ambuja";
        String Last_Name = "Victorjoans";
        int a = 10;
        int b = 10;
        System.out.println(First_Name + Last_Name);
        System.out.println(First_Name + Last_Name + a + b);
        //First "+' behaves like concatenation operator seeing the String
        // and hence the normal math operation doesnt take place there
        //Rule - When first is string, then + operator will concatenate for all

        //To Solve the Problem -- use brackets
        System.out.println(First_Name + Last_Name + (a + b));
        System.out.println(a + b + First_Name + Last_Name);
        //Rule - When first is integer, then first addition takes place, then concatenation takes place
    }
}
