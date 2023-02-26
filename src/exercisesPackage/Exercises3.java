package exercisesPackage;

/*
MAP
Osmary Ostos
StudentId 2394108
*/

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
/******* Exercise 1
 Profit of an investment
 */
       /* double principle = 0;
        double interesRate = 0.0625;
        int numOfYears = 0;

        Scanner kb = new Scanner(System.in);
        while (principle <= 0) {
            System.out.println("Please enter your amount of investent:");
            principle = kb.nextInt();
        };
        while (numOfYears <= 0) {
            System.out.println("Please enter the numer of years you want:");
            numOfYears = kb.nextInt();
        }
        double benefitPerMonth = principle * interesRate;
        double totalBenefit = numOfYears * benefitPerMonth;
        System.out.println();
        System.out.println("Your benefit will be: " + totalBenefit);*/


/******* Exercise 2
 Square rectangule
 */
    /*  Scanner kb2 = new Scanner(System.in);
        int lengthRectangle = 0, breadthRectangle = 0;
        while (lengthRectangle <= 0) {
            System.out.println("Please enter length of an rectangle:");
            lengthRectangle = kb2.nextInt();
        };
        while (breadthRectangle <= 0) {
            System.out.println("Please enter breadth of an rectangle:");
            breadthRectangle = kb2.nextInt();
        };

        if ( lengthRectangle == breadthRectangle )
            System.out.println("Yes, It is a square rectangle");
        else
            System.out.println("Is just a rectangle");*/


        /* Exercise 3
       School Rules
         */

      /*  Scanner kb3 = new Scanner(System.in);
        int grading = 0;
        while (grading <= 0) {
            System.out.println("Please enter your grade:");
            grading = kb3.nextInt();
        };
        if( grading < 25) {
            System.out.println("F , =(");
        }else if ( grading < 45 ){
            System.out.println("E");
        }else if( grading < 50 ){
            System.out.println("D");
        }else if( grading < 60 ){
            System.out.println("C");
        }else if( grading < 80 ){
            System.out.println("B");
        }else{
            System.out.println("The Best! : A");
        }*/


/****** Exercise 4
 School Rules
 */
/*
        Scanner kb4 = new Scanner(System.in);
        int bigger = 0, number = 0;
        int i;
       for (  i = 1; i <= 4; i++){
            System.out.println("Please enter number" + i + ":");
           number = kb4.nextInt();
                if ( i == 1) {
                    bigger = number;
                    continue;
                }
           if(number > bigger ) {
               bigger = number;
           }
        };
        System.out.println("The greatest is: " + bigger);*/


/****** Exercise 5
 Quadratic Equation
 */

      /*  Scanner kb5 = new Scanner(System.in);
        int a=0, b=0, c=0, xPositive =0, xNegative =0, delta=0;
        System.out.println("For ax^2 + bx + c = 0  Introduce the values for" );
        //validate is > 0
        while (a == 0 ) {
            System.out.println("a:");
            a = kb5.nextInt();
        }
        System.out.println("b:");
        b = kb5.nextInt();
        System.out.println("c:");
        c = kb5.nextInt();

        //Validate if delta is >=0
        delta = (b*b) -(4*a*c);
        System.out.println("delta:" + delta );
        if ( delta < 0){
            System.out.println("Because delta is negative, we can not continue for now" );
        } else {

            xPositive = (int) ((b*(-1)) + Math.sqrt(delta))/(2*a);
            System.out.println("Now, your fist value for X is:" );
            System.out.println(xPositive);

            xNegative = (int) ((b*(-1)) - Math.sqrt(delta))/(2*a);
            System.out.println("And, your second value for X is:" );
            System.out.println(xNegative);
        }*/


       /* Exercise 6
      Fibonacii
         */

         /*int x1 = 1, x2 = 1 , fib = 0, fibPrev =1, fibCurr = 1;
        for( int i = 1; fib <=300 ; i ++){
            if( i == 1 || i == 0 )
                fib = 1;
          else{
                fib = fibPrev + fibCurr;
                fibPrev = fibCurr; //1
                fibCurr = fib; //2
            }
            System.out.println("x" + i + ": " + fib);
        }
 */
/****** Exercise 7
 Factorial
 */
       /*  Scanner kb7 = new Scanner(System.in);
        System.out.print("What number do you want calculate a factorial?");
        int limit = kb7.nextInt();
        int factorial =1;
        System.out.print(limit + "!= ");
            for( int j =limit ; j > 0 ; j --){
                factorial *=j ; //4*3 = 12  //
                System.out.print(  j +". " );
            }
           System.out.print(" = " +factorial);
*/
        /****** Exercise 8
         Convert degrees
         */
        //  }
        /*
        Scanner kb8 = new Scanner(System.in);
        int celsius = 0;
        System.out.println("Please enter Farenheit:");
        int far = kb8.nextInt();
        celsius = ((far - 32) * 5) / 9;

        System.out.print(" Celsius = " + celsius);

/******* Exercise 9
      Convert minutes to days and years
         */
        //  }
/*
        int hours=0, days=0,years=0, result =0;
        Scanner kb9 = new Scanner(System.in);
        int minutes = 0;
        while (minutes <= 0) {
            System.out.println("Please enter minutes:");
            minutes = kb9.nextInt();
        };

        //first calculate hours
        hours =  minutes / 60;
        if(hours > 24){
          days = hours / 24;
        }else{
            System.out.print(" Less than 1 day, hours = " + hours);
            return;
        };
        System.out.print(",days = " + days);
        if( days > 365 ) {
            years = days / 365;
            System.out.print(",years = " + years);
        }else{
            System.out.print(" Menos de un año");
            return;
        };
         */

/******* Exercise 10
 Average from tree numbers // cambiar a double
 */
   /*      double avg = 0, number=0, sum=0;
        for( int i = 1; i <=3; i ++){
            Scanner kb10 = new Scanner(System.in);
                System.out.println("Enter number" + i + ":");
                number = kb10.nextDouble();
                sum += number;
                avg = sum/i;
        }
        System.out.println("Average = " + avg);
/*

/****** Exercise 11
     Ammerican flag
 */
/*
      for( int i = 1; i <=15; i ++){
          for( int j = 1; j <=46; j ++){
              if (i <10 && j<13){
                  if(j%2 != 0 )
                    System.out.print("*");
                  else
                      System.out.print(" ");
              }
              else
                  System.out.print("=");
      }
          System.out.println();
        //for asteriscos you have ask for rows
    }
 */
        /****** Exercise 12
         Rectangle
         */
 /*        Scanner kb12 = new Scanner(System.in);
        int lengthRectangle = 0, breadthRectangle = 0;
        while (lengthRectangle <= 0) {
            System.out.println("Please enter length of an rectangle:");
            lengthRectangle = kb12.nextInt();
        };
        while (breadthRectangle <= 0) {
            System.out.println("Please enter breadth of an rectangle:");
            breadthRectangle = kb12.nextInt();
        };

        System.out.println(" The Area of this rectangle is: " + lengthRectangle * breadthRectangle );
        System.out.println(" The Perimeter of this rectangle is: " + (2*lengthRectangle +  2*breadthRectangle));
*/

/******* Exercise 13
 Print a face
 */
        /*
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
 */
/******* Exercise 14
 check if Number is Positive or Negative
 */
      /*   int entry =1;
        do {
            System.out.println();
            System.out.println("Please Enter a number or zero to stop:");
            Scanner kb14 = new Scanner(System.in);
            entry = kb14.nextInt();
            if (entry > 0)
                System.out.println("Positive+");
            else if(entry<0)
                System.out.println("Negative-");
            else
                System.out.println("Ok, thanks");
        }while(entry != 0);
         */

/******* Exercise 15
    Even or Odd
*/
     /*   Scanner kb15 = new Scanner(System.in);
        System.out.println("Please Enter a number to check if is even:");
        int entry = kb15.nextInt();
        if(entry%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
*/
/******* Exercise 16
        Patterns
 a*********)
 5
 45
 345
 2345
 12345
 */
     /*
        Scanner kb16 = new Scanner(System.in);
        int lines = 0;
        while (lines <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        };
        for( int i = lines; i >0; i --){
            for( int k = i; k <=lines; k ++){
              System.out.print(k);
        }
            System.out.println();
     }
       */

/****** b)
        1
        12
        123
        1234
        12345
        123456
*/
/*
        Scanner kb16 = new Scanner(System.in);
        int lines = 0;
        while (lines <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        };
        for( int i = 1; i <=lines; i ++){
            for( int k = 1; k <=i; k ++){
                System.out.print(k);
            }
            System.out.println();
        }

 */

/*c)
 * * * * *
  * * * *
   * * *
    * *
     *
*/
        /*
        Scanner kb16 = new Scanner(System.in);
        int lines = 0;
        while (lines <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        };
        for( int i = lines; i >0; i --){
            for( int j = 0; j < (lines-i); j ++){
                System.out.print(" ");
            }
            for( int k = 0; k <i; k ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
/****** d)

 *     *
 *    **
 *   ***
 *  ****
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
  /*      Scanner kb16 = new Scanner(System.in);
        int linesTot = 0, lines =0;
        while (linesTot <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            linesTot = kb16.nextInt();
        };
        lines = linesTot /2;
        for( int i = lines; i >0; i --){
            for( int k = 0; k <i; k ++){
                System.out.print(" ");
            }
            for( int j = 0; j < (lines-i); j ++){
                System.out.print("*");
            }

            System.out.println();
        }
        //the other half
        for( int i = lines; i >0; i --){  //i=5
            for( int j = 0; j < (lines-i); j ++){
                System.out.print(" ");
            }
            for( int k = 0; k <i; k ++){ //i=5  j hasta
                System.out.print("*");
            }

            System.out.println();
        };

*/

/* e).
 * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * * */
 /* Scanner kb16 = new Scanner(System.in);
        int lines = 0;
        while (lines <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        };
        for( int i = lines; i >0; i --){
            for( int j = 1; j <= (lines-i); j ++){
                System.out.print(" ");
            }
            for( int k = 1; k <=i; k ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for( int i = lines; i >0; i --){
            for( int k = 1; k <i; k ++){
                System.out.print(" ");
            }
            for( int j = 0; j <= (lines - i) ; j ++){
                System.out.print("* ");
            }

            System.out.println();
        }
  */
  /*
  f)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

   /*
        Scanner kb16 = new Scanner(System.in);
        int lines = 0, cont =1;
        while (lines <= 0) {
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        };
        for( int i = 1; i <=lines; i ++){
            for( int k = 1; k <=i; k ++){
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println();
        }
        */

/*******
g). (it should be odd number)
    1
   212
  32123
 4321234
  32123
   212
    1
 */
    /*    Scanner kb16 = new Scanner(System.in);
        int lines = 0, count = 0; //&& lines%2 != 0
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        for( int i = lines; i >=0; i --){
            for( int k = 1; k <=i; k ++){
                System.out.print(" ");
            }
            for( int j = 1; j <= (lines - i) ; j ++){ // 4 _3 = 1 --- ; 4 -2
                count = lines - i  -j +1;
                System.out.print(count);
            }

            for( int j = 2; j <= (lines - i) ; j ++){
                System.out.print(j);
            }

            System.out.println();
        }

        for( int i = lines -1; i >0; i --){
            for( int j = 1; j <= (lines-i); j ++){
                System.out.print(" ");
            }
            for( int k = 1; k <=i; k ++){
                count = i -k +1;
                System.out.print(count);
            }
            for( int j = 2; j <= i ; j ++){
                System.out.print(j);
            }
            System.out.println();
        }

     */
/*******
 * h)
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 */
/*
  Scanner kb16 = new Scanner(System.in);
        int lines = 0, count = 0; //&& lines%2 != 0
            System.out.println("Please, how many lines do you want? = ");
            lines = kb16.nextInt();
        for( int i = lines; i >=0; i --){
            for( int k = 1; k <=i; k ++){
                System.out.print(" ");
            }
            for( int j = 1; j <= (lines - i) ; j ++){ // 4 _3 = 1 --- ; 4 -2
                count = lines - i  -j +1;
                System.out.print('*');
            }

            for( int j = 2; j <= (lines - i) ; j ++){
                System.out.print('*');
            }

            System.out.println();
        }

        for( int i = lines -1; i >0; i --){
            for( int j = 1; j <= (lines-i); j ++){
                System.out.print(" ");
            }
            for( int k = 1; k <=i; k ++){
                count = i -k +1;
                System.out.print('*');
            }
            for( int j = 2; j <= i ; j ++){
                System.out.print('*');
            }
            System.out.println();
        }
*/
/****** Exercise 17
 cube of the number up to given an integer.
*/
    /*    Scanner kb17 = new Scanner(System.in);
        System.out.print("What number do you want calculate series of cube?");
        int cube = kb17.nextInt();
            for( int j =1 ; j <= cube ; j ++){
                System.out.println("Number is " + j + " and its cube is: " + (int)Math.pow(j,j)) ;

            }
*/
/****** Exercise 18
 * Sum of the series 1 +11 + 111 + 1111 + .. n
*/
   /*     Scanner kb18 = new Scanner(System.in);
        System.out.print("What number do you want calculate series sum?");
        String number = "";
        int sum = 0;
        int limit = kb18.nextInt();
            for( int j =1 ; j <= limit ; j ++){
                number+= '1';
                System.out.print(number);
                if(j != limit)
                    System.out.print(" + ");
                sum+= Integer.valueOf(number);

            }
        System.out.print( " = " + sum);
*/

/****** Exercise 19
 * Sum of the series 1 +11 + 111 + 1111 + .. n
 */
      /*  int avg = 0, num=1, sum=0, count=1;

        Scanner kb19 = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Please enter next number to calculate an average, zero to escape");
            num = kb19.nextInt();
            sum+=num;
            avg = sum/count;
            count++;
            System.out.println("So far, the sumatory is: " + sum + " and average " + avg);
        };

       */


/****** Exercise 20
 * Sum of the series 1 +11 + 111 + 1111 + .. n
 */
  /*  String rate="0";
    Scanner kb20 = new Scanner(System.in);
    System.out.println("Introduce a leter");
    rate = kb20.next();
    switch (rate)
    {
        case "E" :
            System.out.println("Excellent");
            break;
        case "V" :
            System.out.println("Very Good");
            break;
        case "G" :
            System.out.println("Good");
            break;
        case "A" :
            System.out.println("Average");
            break;
        case "F" :
            System.out.println("Fail");
            break;
        default:
            System.out.println("Available options: E, V, G, A, F");
    }
*/
/****** Exercise 21
 10 multiplication table
*/
/*
int limit = 10;
 /+
System.out.println("Multiplication table of " + limit);
for( int j =1 ; j <= limit ; j ++) {
    System.out.println(limit + "x" + j +"= " + limit*j);
}
*/
/****** Exercise 22
10 multiplication table
*/

    Scanner kb22 = new Scanner(System.in);
    System.out.println("Introduce a number to print its table of multiplication...");
    int limit = kb22.nextInt();
    System.out.println("Multiplication table of " + limit);
    for( int j =1 ; j <= 10 ; j ++) {
        System.out.println(limit + "x" + j +"= " + limit*j);
    }

    }
}


