import java.util.Scanner;
	
class kilometerToMiles{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value in kilometer : ");
		double input = scanner.nextDouble();

		System.out.println("Value in miles : " + kToM(input));
	}
	public static double kToM(double num){
		return num * 0.621371;
	}
}