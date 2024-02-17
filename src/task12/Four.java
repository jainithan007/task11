package task12;


import java.util.ArrayList;
import java.util.List;

	public class Four {
	    public static void main(String[] args) {
	       
	        List<String> stringList = new ArrayList<>();
	        stringList.add("Item 1");
	        stringList.add("Item 2");
	        stringList.add("Item 3");

	        
	        String[] stringArray = stringList.toArray(new String[0]);

	   
	        for (String element : stringArray) {
	            System.out.println(element);
	        }
	    }
	}


