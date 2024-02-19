package Task10;


class Account {
 public double balance;


 public Account() {
     this.balance = 500.0;
 }

 
 public Account(int balance) {
     this.balance = balance;
 }

 public void withdraw(int amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient balance.");
     }
 }


 public void deposit(int amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }


 public double getBalance() {
     return balance;
 }
}
public class Twoconstrctor {
	
	  public static void main(String[] args) {

		  Account obj = new Account();
	
		  obj.deposit(100);
		  obj.withdraw(200);
}
}
