import java.util.Scanner;
public class SmartPhone {

	private double length, width, height, weight;
		

		
		Scanner s = new Scanner(System.in);
		//default constructor
	SmartPhone(){
		System.out.print("Please enter the length of smartphone: ");
		this.length = s.nextDouble();
		System.out.print("Please enter the width of smartphone: ");
		this.width = s.nextDouble();
		System.out.print("Please enter the height of smartphone: ");
		this.height = s.nextDouble();
		System.out.print("Please enter the weight of smarphone: ");
		this.weight = s.nextDouble();
	}
	
	double getLength() {
		return this.length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
		
}
