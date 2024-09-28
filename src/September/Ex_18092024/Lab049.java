package September.Ex_18092024;

public class Lab049 {
    public static void main(String[] args) {
        long phone_no = 9884969630l;
        //short s = phone_no; //Implicit Narrowing; Invalid Statement
        //JVM will not allow you to do Implicit Narrowing
        short s = (short)phone_no;
        //short s = phone_no; //Explicit Narrowing;
        //JVM allows this when explicitly mentioned, but there will be a loss of data
        System.out.println(phone_no);
        System.out.println(s);


    }
}
