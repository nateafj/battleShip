import java.util.ArrayList; // Importing the ArrayList class from the java.util package
import java.util.Scanner; // Importing the Scanner class from the java.util package

public class Main {
    ArrayList<battleShip> ships = new ArrayList<>(); // Creating an ArrayList to store instances of the battleShip class

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // The main method is currently empty, so no code execution occurs here
    }

    // Method to set up the game board and battleships
    public void setupBoard() {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input

        System.out.print("Two player battleship game!!! \n P1: battle ship 1 \n 1. horizontal \n 2. vertical");
        int sel = Integer.parseInt(scanner.nextLine()); // Reading the user's selection

        if (sel == 1) { // If the user selected horizontal positioning
            System.out.println("x  point");
            int x = Integer.parseInt(scanner.nextLine()); // Reading the x-coordinate

            System.out.println("Enter y axis points one by one (press enter after each one");
            ArrayList<String> y = new ArrayList<>(); // Creating an ArrayList to store y-axis points

            y.add(scanner.nextLine()); // Adding the first y-axis point
            y.add(scanner.nextLine()); // Adding the second y-axis point
            y.add(scanner.nextLine()); // Adding the third y-axis point
        } else { // If the user selected vertical positioning
            System.out.println("y  point");
            String x = (scanner.nextLine()); // Reading the y-coordinate

            System.out.println("Enter y axis points one by one (press enter after each one");
            ArrayList<String> y = new ArrayList<>(); // Creating an ArrayList to store y-axis points

            y.add(scanner.nextLine()); // Adding the first y-axis point
            y.add(scanner.nextLine()); // Adding the second y-axis point
            y.add(scanner.nextLine()); // Adding the third y-axis point
        }
    }
}
