import java.sql.Array; // Importing the Array class from the java.sql package (not used in the code)
import java.util.ArrayList; // Importing the ArrayList class from the java.util package

public class battleShip {
    String name; // Declaring a variable to store the name of the battleship
    ArrayList<String> yAxis = new ArrayList<>(); // Creating an ArrayList to store vertical positions (y-axis)
    ArrayList<Integer> xAxis = new ArrayList<>(); // Creating an ArrayList to store horizontal positions (x-axis)

    // Constructor for the battleship class
    public battleShip(String name, ArrayList<Integer> x,  ArrayList<String> y) {
        this.name = name; // Assigning the provided name to the battleship's name
        yAxis = y; // Assigning the provided y-axis positions to the battleship's yAxis ArrayList
        xAxis = x; // Assigning the provided x-axis positions to the battleship's xAxis ArrayList
    }

    // Method to check if a given position (x, y) is a hit on the battleship
    public boolean isHit(String y, Integer x) {
        if (yAxis.contains(y) && xAxis.contains(x)) {
            return true; // If both the y-axis and x-axis contain the provided position, it's a hit
        }
        return false; // If either the y-axis or x-axis doesn't contain the position, it's a miss
    }
}
