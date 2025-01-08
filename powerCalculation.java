import java.util.Scanner;
import java.lang.Math;

class powerCalculation{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base : ");
		double base = scanner.nextDouble();
		System.out.println("Enter Power : ");
		double power = scanner.nextDouble();

		System.out.println("Result : " + exponent(base, power));
	}

	public static double exponent(double b, double p){	
		return Math.pow(b, p);
	}
}