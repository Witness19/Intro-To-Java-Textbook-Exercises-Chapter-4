// Exercise 4.1 (Geometry: area of a pentagon)
import java.util.Scanner;

public class Exercise_4_1 {
    public static void main(String[] args) {
        // Step 1. Prompt the user to enter the length from the center of a pentagon to a vertex
        Scanner input = new Scanner(System.in); // Instantiate the Scanner Class
        System.out.print("Enter the length from the center of a pentagon to a vertex: "); // Prompt Input
        double centerToVertex = input.nextDouble(); // Read Input

        /* 
        Step 2. Compute the area of the pentagon
        Area Of A Pentagon = (5 * s^2) / (4 * tan(pi/5))
        s = Length of a side --> Formula to find s: s = 2rsin(pi/5) --> r = centerToVertex
        */
        double side = (2 * centerToVertex * Math.sin(Math.PI/5)); // Find the length of a side: "s"
        double area = (5 * Math.pow(side, 2)) / (4 * (Math.tan(Math.PI/5)));

        // Step 3. Print the area of a pentagon. Round the result up two digits
        System.out.printf("The area of the pentagon is %.2f", area);

        input.close();
    }
}
