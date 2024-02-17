package task12;
import java.util.Map;
	import java.util.TreeMap;

	public class Three {
	    public static void main(String[] args) {
	   
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();
	        employeeMap.put(101, "John Doe");
	        employeeMap.put(102, "Jane Smith");
	        employeeMap.put(103, "Bob Johnson");

	        
	        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }
	}


