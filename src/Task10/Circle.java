package Task10;

public class Circle {

	    public double radius;

	   
	    public Circle() {
	        this.radius = 0.0; 
	    }

	  
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	  
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	     public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public static void main(String[] args) {
	       
	        Circle circle1 = new Circle(); // Using no-argument constructor
	        System.out.println("Circle 1 circumference: " + circle1.calculateCircumference());

	        Circle circle2 = new Circle(5.0); // Using constructor with radius argument
	        System.out.println("Circle 2 circumference: " + circle2.calculateCircumference());
	    }
	}


