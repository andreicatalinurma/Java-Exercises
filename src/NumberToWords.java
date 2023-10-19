/*
*Number To Words
Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".


Example Input/Output - getDigitCount method

getDigitCount(0); should return 1 since there is only 1 digit

getDigitCount(123); should return 3

getDigitCount(-12); should return -1 since the parameter is negative

getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

reverse(-121); should  return -121

reverse(1212); should return  2121

reverse(1234); should return 4321

reverse(100); should return 1

Example Input/Output - numberToWords method

numberToWords(123); should print "One Two Three".

numberToWords(1010); should print "One Zero One Zero".

numberToWords(1000); should print "One Zero Zero Zero".

numberToWords(-12); should print "Invalid Value" since the parameter is negative.
* */


public class NumberToWords {
    public static void main(String[] args) {
        /*System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));*/

        /*System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));*/

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(101);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int numberDigits = getDigitCount(number);
        StringBuilder numberToWords = new StringBuilder();

        for(int i = 0; i < numberDigits; i++){

            int lastDigit = number % 10;
            number = number / 10;

            switch (lastDigit){
                case 0 :
                    numberToWords.insert(0, "Zero ");
                    break;
                case 1 :
                    numberToWords.insert(0, "One ");
                    break;
                case 2:
                    numberToWords.insert(0, "Two ");
                    break;
                case 3:
                    numberToWords.insert(0, "Three ");
                    break;
                case 4:
                    numberToWords.insert(0, "Four ");
                    break;
                case 5:
                    numberToWords.insert(0, "Five ");
                    break;
                case 6:
                    numberToWords.insert(0, "Six ");
                    break;
                case 7:
                    numberToWords.insert(0, "Seven ");
                    break;
                case 8:
                    numberToWords.insert(0, "Eight ");
                    break;
                case 9:
                    numberToWords.insert(0, "Nine ");
                    break;
                default:
                    break;
            }
        }
        System.out.println(numberToWords);
    }

    public static int reverse (int number){
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0){
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return  reverse;
    }
    public static int getDigitCount (int number){
        int counter = 0;
        if(number < 0){
            return -1;
        }
        while (number >= 0){
            number /= 10;
            counter ++;
            if(number == 0){
                break;
            }
        }

        return counter;
    }
}






















