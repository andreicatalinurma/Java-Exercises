/*
* Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
* */

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome ( int number){
        int reverse = 0;
        if(number < 0){
            number = number * -1;
        }
        int initialNumber = number;

        while (initialNumber > 0){
            int lastDigit = initialNumber % 10;
            reverse = reverse * 10 + lastDigit;
            initialNumber /= 10;
        }
        return (number == reverse);
    }
}
