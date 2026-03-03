/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ssk14
 */
public class ElevatorTest {

    public static void main(String[] args) {

        Elevator myElevator = new Elevator();

        System.out.println("Start on the first floor:");
        myElevator.displayCurrentFloor();

        System.out.println("Go to the second floor:");
        myElevator.goUp();
        myElevator.displayCurrentFloor();

        System.out.println("Go to the third floor:");
        myElevator.goUp();
        myElevator.displayCurrentFloor();

        System.out.println("Attempt to go to the fourth floor:");
        myElevator.goUp();
        myElevator.displayCurrentFloor();

        System.out.println("Go back to the second floor:");
        myElevator.goDown();
        myElevator.displayCurrentFloor();

        System.out.println("Go back to the first floor:");
        myElevator.goDown();
        myElevator.displayCurrentFloor();
    }
}


