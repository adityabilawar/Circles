// Aditya Bilawar period 6
//this program calculates the Area and circumference of a circle

public class Circles {
	private double radius;
	private double diameter;
	
	
	public Circles() {
		
	}
	
	public Circles (double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
		
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
		
	}
	
	public double getCircumference() {
		return Math.PI * diameter;
	}
	
	public void changeRadius(double radius) {
	        this.radius = radius;
	        this.diameter  = radius *2;
		
	}
	
	public String toString() {
		
		return "radius: " + this.radius + " units\nArea: " + getArea() + " square units\nDiameter: " + this.diameter +  " units\nCircumference: " + getCircumference() + " units";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}