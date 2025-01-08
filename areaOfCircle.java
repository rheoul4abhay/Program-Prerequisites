import java.lang.Math;
import java.util.Scanner;

class areaOfCircle{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double input = scanner.nextDouble();
		System.out.println("Area of the circle is : " + areaCircle(input));		
	}

	public static double areaCircle(double radius){
		return Math.PI * Math.pow(radius, 2); 
	}
}