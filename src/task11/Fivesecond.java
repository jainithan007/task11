package task11;

public class Fivesecond {

public static void main(String[] args) {
	        try {
	            String str = "Hello";
	            char charAtInvalidIndex = str.charAt(10); 
	            System.out.println("Character at index 10: " + charAtInvalidIndex);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String Index Out Of Bound");
	        }
	    }
	}


