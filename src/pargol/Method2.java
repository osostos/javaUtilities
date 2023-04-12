package pargol;

import java.util.Scanner;

//Look for vowels in a string
public class Method2 {
    public static int vowels(String txt){
        int counter = 0;
        char ch;
        for( int i = 0; i < txt.length(); i++){
            ch = txt.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'  )
                counter ++;
        }


        return counter;
    }

    public static boolean vowelsAll(String txt){
        if(txt.length() == vowels(txt))
            return true;
        return false;

    }
    public static boolean validatePassword(String txt){
        int counter = 0;
        char ch;
        boolean lett = false, num = false, chara = false;
        //tvalidate if at least a number, a letter and a special character
        for( int i = 0; i < txt.length(); i++){

            ch = txt.charAt(i);
            int j= (int)(ch);

            if( j >='0' && j <= '9') { //numero<
                lett = true;
                ++counter;
            }
            if( ch >='A' && ch <= 'Z')  //numero
                num = true;
            ++counter;
            if(ch == '*' || ch == ','  )
                chara= true;
            ++counter;

        }

        return (lett && num && chara);
    }
    public static void main(String[] args) {
        System.out.println("Enter a chain of characters.." );
        //System.out.println("Enter a password.." );
        Scanner kb = new Scanner(System.in);
        String op = kb.next();
        //int u = vowels(op);
        boolean b = vowelsAll(op);
        //System.out.println(op + " has " + u + " vowels" );
        // System.out.println(op + "is Valid? " + validatePassword(op));
        System.out.println(op + " all Vowels? " + b );

    }


}
