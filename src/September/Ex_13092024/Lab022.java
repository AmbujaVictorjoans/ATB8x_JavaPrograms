package September.Ex_13092024;

public class Lab022 {
    public static void main(String[] args) {
        //Character Literals

        //Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        //Escape Char
        char new_line = '\n';
        //char tab_line = '\t';
        char back_space ='\b';
        char car_r = '\r'; //Carriage Return

        System.out.println("Ambuja" + new_line + "Victorjoans");
        System.out.println("Ambuja" + '\t' + "Victorjoans");
        System.out.println("Ambuja" + back_space + "Victorjoans");
        System.out.println("Ambuja" + car_r + "Victorjoans");

        char c11 = 'A'; //ASCII value of A is 65
        char c12 = '\u1F60'; //Unicode character of a Smiley
        //After the Amercicans, the Chinese, Indians, Japenese came, and started using Unicode Character System
        //Every key in the Keyboard has a Unicode value.
        //u0041 - Unicode Character of A
        //Even the smileys have a unicode value, sad smiley has a unicode
        //all these unicode values are stored in Char
        System.out.println(c11);
        System.out.println(c12);

        //we can store different  type of characters like smileys, chinese characters using their unicode value
        // Every key in the keyboard is associated with the ASCII value, unicode character.

    }
}
