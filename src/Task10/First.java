package Task10;
  
 class Person {

    public static String name;
    public static int age;
      
    public Person(String name, int age) {
        Person.name = name;
        Person.age = age;
        System.out.println("Name: " + Person.getName());
        System.out.println("Age: " + Person.getAge());
    }
    
  
    public static String getName() {
        return name;
                
    }
    
    public static int getAge() {
        return age;
    }
}

public class First {

	public static void main(String[] args) {

   
		   Person obj = new Person("mahesh", 21);
		       
		   obj.getName();
		   obj.getAge();
		       
//		        System.out.println("Name: " + person1.getName());
//		        System.out.println("Age: " + person1.getAge());
		    }

}