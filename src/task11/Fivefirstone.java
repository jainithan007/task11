package task11;

public class Fivefirstone {

	public static void main(String[] args) {
		
		        try {
		            int[] numbers = {1, 2, 3};
		            int indexOutOfRange = numbers[3]; // Accessing index 3, which is out of bounds
		            System.out.println("Value at index 3: " + indexOutOfRange);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: Array Index Out Of Bounds");
		        }
		    }
	


	}


