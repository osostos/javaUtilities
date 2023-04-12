package pargol;

import java.util.Scanner;

public class Methods {
    //calculator
    int total=0;

    public static int adition(int a,int b){
        return a + b;
    }
    public static int multiplication(int a,int b){
        return a * b;
    }
    public static int substraction(int a,int b){
        return a - b;
    }
    public static int division(int a,int b){
        if(b == 0){
            System.out.println("Error--> Division by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("----Calculator-------" );
        System.out.println("***Choose operation***" );
        System.out.println("1 => Adition" );
        System.out.println("2 => Substraction" );
        System.out.println("3 => Multiplication" );
        System.out.println("4 => Division" );
        int op = kb.nextInt();
        System.out.println("Enter first number.." );
        int a = kb.nextInt();
        System.out.println("Enter second number.." );
        int b = kb.nextInt();


        switch (op){
            case 1:
                System.out.println("Result = " + adition(a,b) );
                break;
            case 2:
                System.out.println("Result = " + substraction(a,b) );
                break;
            case 3:
                System.out.println("Result = " + multiplication(a,b) );
                break;
            case 4:
                System.out.println("Result = " + division(a,b) );
                break;
        }








    }
}
