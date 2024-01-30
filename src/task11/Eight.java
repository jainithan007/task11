package task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Eight {
    
	public static void main(String[] args) {
        try {
            readFile("example.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }

   
    private static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
       
}
}