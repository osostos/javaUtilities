package pargol;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

       /* int[] ar1 = new int [6];
        ar1[0] = 3;
        ar1[1] = 5;
        ar1[2] = 73;
        ar1[3] = 13;
        ar1[4] = -56;
        ar1[5] = 25;

        //Look for a number from user
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to find it..");
        int op = kb.nextInt();
        boolean find = false;
        for (int i = 0; i < 6 ; i++){
            if(op == ar1[i] ){
                System.out.println( "We find it!! .." + ar1[i]);
                find = true;
                break;
            }
        }
        if(!find)  System.out.println( "We do  not find it!! ..");
*/
        //Show the lenght of an array
       /* int[] ar1 = new int [12];
        ar1[0] = 3;
        ar1[1] = 5;
        ar1[2] = 73;
        ar1[3] = 13;
        ar1[4] = -56;
        ar1[5] = 25;
        ar1[6] = 3;
        ar1[7] = 5;
        ar1[8] = 73;
        ar1[9] = 13;
        ar1[10] = -56;
        ar1[11] = 25;

        //Look for a number from user
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to show it..");
        int op = kb.nextInt();
        boolean find = false;
        for (int i = 0; i < op ; i++){
                System.out.println( ar1[i] );
            }*/

        //Doinamically built an array
       /* Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to build an array..");
        int op = kb.nextInt();
        int newnumber;
        int[] ar1 = new int[op];
        for (int i = 0; i < op ; i++){
            System.out.println( "Numer of position " + i );
            newnumber = kb.nextInt();
            ar1[i] = newnumber;
            System.out.println(ar1[i]);
        }

        */

       /* Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to build an array..");
        int op = kb.nextInt();
        int newnumber;
        int[] ar1 = new int[op];
        for (int i = 0; i < op ; i++){
            ar1[i] = i*5;
        }

        System.out.println("Enter a number to find it into an array..");
        int number = kb.nextInt();
        boolean find = false;
        for (int i = 0; i < op ; i++){
            if(ar1[i] == number ){
                System.out.println( "We find it!! position" + i);
                find = true;
                break;
            }
        }
        if(!find)  System.out.println( "We do  not find it!! .." + ar1.toString());

        */

      //  Array of Array

      /*  int[] ar1 = new int[2];
        int[] ar2 = {5, 7, 3, 2, 8};
        int[][] ar3 = {{1,2},{3,4},{4,5},{6,7}}; //ar3[2][1] = 5
        int[][] ar4 = new int[4][2];
        for (int i = 0; i < 4 ; i++) { //para el primer array o i< ar3.length
            for (int j = 0; j < 2 ; j++) { //para el segundo array o i< ar3[i].length more elegant
                System.out.println(ar3[i][j]);
            }
        }

       */

        //Array 10x10 with random numbers
        int[][] ar4 = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < ar4.length ; i++) { //para el primer array o i< ar3.length
            for (int j = 0; j < ar4[i].length ; j++) { //para el segundo array o i< ar3[i].length more elegant
                ar4[i][j] = rand.nextInt(100);
            }
        }
        for(int i= 0; i < 5 ; i++){
            double j =  Math.random();
        }
        for (int i = 0; i < ar4.length ; i++) { //para el primer array o i< ar3.length
            for (int j = 0; j < ar4[i].length ; j++) { //para el segundo array o i< ar3[i].length more elegant
                ar4[i][j] = rand.nextInt(100);
                 System.out.printf("%4d",ar4[i][j]);
            }
             System.out.println();
        }
    }

}

