*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ssk14
 */
    public class Elevator {

    // private variable to store the current floor
    private int currentFloor;

    // constructor
    public Elevator() {
        // start elevator on the first floor
        currentFloor = 1;
    }

    // method to move elevator up one floor
    public void goUp() {
        // test to see if currentFloor == 3
        if (currentFloor == 3) {
            System.out.println("Cannot go up. Already on the third floor.");
        } else {
            // add 1 to currentFloor
            currentFloor = currentFloor + 1;
        }
    }

    // method to move elevator down one floor
    public void goDown() {
        // test to see if currentFloor == 1
        if (currentFloor == 1) {
            System.out.println("Cannot go down. Already on the first floor.");
        } else {
            // subtract 1 from currentFloor
            currentFloor = currentFloor - 1;
        }
    }

    // method to display the current floor
    public void displayCurrentFloor() {
        System.out.println("Current floor: " + currentFloor);
    }
}


   
