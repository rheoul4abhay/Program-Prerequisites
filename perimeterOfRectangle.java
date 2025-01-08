import java.util.Scanner;

class perimeterOfRectangle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length: ");
		double l = scanner.nextDouble();
		System.out.println("Enter Width: ");
		double w = scanner.nextDouble();
		
		System.out.println("Perimeter : " + perimeterRectangle(l, w));
	}
	public static double perimeterRectangle(double length, double width){
		return 2*(length + width);
	}
}