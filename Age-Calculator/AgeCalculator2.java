*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package agecalculator2;

import javax.swing.JOptionPane;

public class AgeCalculator2 {

    public static int CalculateAge(int birthMonth, int birthDay, int birthYear,
                                   int todayMonth, int todayDay, int todayYear) {

        int birthDate = birthYear * 10000 + birthMonth * 100 + birthDay;
        int todayDate = todayYear * 10000 + todayMonth * 100 + todayDay;

        int difference = todayDate - birthDate;
        return difference / 10000;
    }

    public static void main(String[] args) {

        int birthMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter birth month (1-12):"));
        int birthDay   = Integer.parseInt(JOptionPane.showInputDialog("Enter birth day:"));
        int birthYear  = Integer.parseInt(JOptionPane.showInputDialog("Enter birth year:"));

        int todayMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter current month (1-12):"));
        int todayDay   = Integer.parseInt(JOptionPane.showInputDialog("Enter current day:"));
        int todayYear  = Integer.parseInt(JOptionPane.showInputDialog("Enter current year:"));

        int age = CalculateAge(birthMonth, birthDay, birthYear, todayMonth, todayDay, todayYear);

        System.out.println("The person is " + age + " years old.");
    }
}
