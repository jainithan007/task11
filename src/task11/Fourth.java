package task11;

import java.util.Scanner;

public class Fourth {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter the first integer: ");
	            int numer = scanner.nextInt();

	            System.out.print("Enter the second integer: ");
	            int denominator = scanner.nextInt();

	            if (denominator == 0) {
	                System.out.println("Error: Cannot divide by zero.");
	            } else {
	                int result = numer / denominator;
	                System.out.println("Result of division: " + result);
	            }

	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter integers only.");
	        } finally {
	      
	        }
	    }
	}



