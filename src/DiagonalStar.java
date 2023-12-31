/*
* Diagonal Star
Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*).
* This should be accomplished by using loops (see examples below).
* EXAMPLE INPUT/OUTPUT:

EXAMPLE 1

printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

Explanation:

*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars


EXAMPLE 2

printSquareStar(8); should print the following:

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
* */


public class DiagonalStar {
    public static void main(String[] args) {
    printSquareStar(8);
    printSquareStar(5);
    }
    public static void printSquareStar (int number){
        if(number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++){

                for (int j = 0; j < number; j++){
                    if (j == 0 || j == number - 1 || i == 0 || i == number - 1){
                        System.out.print("*");
                    }else {
                        if( i == j){
                            System.out.print("*");
                        }else {
                            if(j == number - i - 1){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }

}
