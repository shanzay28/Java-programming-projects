*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversedigitsprogram;

/*
 * Program: ReverseDigitsProgram
 * Description: Takes an integer and prints it reversed.
 */

public class ReverseDigitsProgram {

    public static int Reverse_Digits(int number) {

        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        int userNumber = 1234;   // fixed number for screenshot

        int reversedNumber = Reverse_Digits(userNumber);

        System.out.println("Original number: " + userNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
