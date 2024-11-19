package Tasks;

public class Task01_23rdSeptember {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication, division, modulus

        int num1 = 8;
        int num2 = 4;
        String Operation = "Modulus";
        switch (Operation) {
            case "Addition":
                System.out.println(num1 + num2);
                break;
            case "Subtraction":
                System.out.println(num1 - num2);
                break;
            case "Multiplication":
                System.out.println(num1 * num2);
                break;
            case "Division":
                System.out.println(num1/num2);
                break;
            case "Modulus":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Null Value");
        }

    }
}
