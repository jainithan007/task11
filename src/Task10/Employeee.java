package Task10;

public class Employeee {
    public String id;
    public String firstName;
    public String lastName;
    public int salary;

 
    public Employeee(String id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

  
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }


    public void raiseSalary(int percent) {
        double raisePercentage = (double) percent / 100;
        int raiseAmount = (int) (salary * raisePercentage);
        salary += raiseAmount;
        System.out.println("Salary increased by " + percent + "%. New salary: " + salary);
    }

    public static void main(String[] args) {
   
        Employeee emp = new Employeee("EMP001", "Mahesh", "K", 60000);
        
     
        System.out.println("Initial Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Salary: " + emp.getSalary());

         
        emp.raiseSalary(12);
    }
}
