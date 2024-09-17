package September.Ex_13092024;

import java.sql.SQLOutput;

public class Lab012 {
    public static void main(String[] args) {
        //data type variable_name = variable_value
        //Variable_name has rules that needs to be followed
        //1. Variable_Name (also called as identifiers) can contain Alphabets, Digits and two special symbols.
        //2. Variable_Name must start with a Alphabet, $, _
        //3. Keywords cant be used as variable names
        //4. No space is allowed in a variable name

        //boolean 123 = true; -- wrong as identifier cannot start with a number

        boolean $ = true;
        boolean _ = false;
        boolean god_is_good = true;
        //boolean 123god_is_good = true; -- incorrect

        boolean GOD_IS_GOOD$$$ = true;
        boolean _do_you_know_java123 = false;
        boolean $IS_java_easy_to_learn = true;

        System.out.println(god_is_good);
        System.out.println(_do_you_know_java123);
        System.out.println($IS_java_easy_to_learn);


    }
}
