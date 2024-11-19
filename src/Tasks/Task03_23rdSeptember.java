package Tasks;

public class Task03_23rdSeptember {
    public static void main(String[] args) {
        //Write a program that converts between different units ( kilo to miles)
        // (celsius to fahrenheit

        int value1 = 34;
        //int value2 = 38;
        double result1;
       // double result2;
        double conv_fac = 1.609344;

        String ConversionChoice = "KM to Miles";
        switch (ConversionChoice){
            case "KM to Miles":
                result1 = value1/conv_fac;
                System.out.println("Number of Miles");
                System.out.println(result1);
                break;
            case "Celsius to Fahrenheit":
                result1 = ((value1 * 1.8) + 32);
                System.out.println("Value of Fahrenheit");
                System.out.println(result1);
                break;
            default:
                System.out.println("Invalid Choice of Conversion");
                break;
        }
    }
}
