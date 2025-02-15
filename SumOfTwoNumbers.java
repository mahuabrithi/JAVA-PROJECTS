import java.util.Scanner; // Importing Scanner class for user input

public class SumOfTwoNumbers { // Creating a class named "SumOfTwoNumbers"
    public static void main(String[] args) { // Main method, program execution starts here
        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input

        // Asking the user to enter the first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt(); // Reading first number from user and storing in variable 'a'

        // Asking the user to enter the second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt(); // Reading second number from user and storing in variable 'b'

        // Calculating sum of the two numbers
        int sum = a + b;

        // Displaying the sum
        System.out.println("Sum: " + sum);

        sc.close(); // Closing the Scanner object
    }
}
