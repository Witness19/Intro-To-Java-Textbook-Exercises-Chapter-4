/*
(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula (s is the length of a side):

Write a program that prompts the user to enter the side of a hexagon and displays
its area.
 */

import java.util.*;

public class Exercise_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // instantiate the scanner class
        
        System.out.print("Enter the side: "); // prompt input: side of a hexagon
        double side = input.nextDouble(); // read input
        
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6)); // Compute the area of a hexagon
        System.out.printf("The area of the hexagon is %.2f", area); // print the area of a hexagon

    }
}
