import java.util.Scanner;
import java.lang.Math;
class volumeOfCylinder{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of cylinder: ");
		double radius = scanner.nextDouble();
		System.out.println("Enter height of cylinder: ");
		double height = scanner.nextDouble();

		System.out.println("Volume of cylinder is : " + volumeCylinder(radius, height));
	}

	public static double volumeCylinder(double rad, double height){
		return Math.PI * Math.pow(rad, 2) * height;
	}
}