package September.Ex_23092024_Switch;

public class Lab_082 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10"); //(-1) in the switch expression will match with the case -1
                break;
            case 9:
                System.out.println("11");
                break;
        }
    }
}
