 package Package;


import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<String>();
		name.add("jai");
		name.add("minu");
		name.add("kumar");
		name.add("mano");
		
		//System.out.println(name.size());
		//System.out.println(name);
		
//		Iterator<String> itr  = name.iterator();
		
//	   while(itr.hasNext())  {
//		System.out.println(itr.next());
//	}
		System.out.println("forloop");
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
	for (String n : name) {
	System.out.println(n);
		
	}
}
}