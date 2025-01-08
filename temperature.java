import java.util.Scanner;
class temperature{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double temp = scanner.nextDouble();
		System.out.println("Fahrenheit : " + convert(temp));
	}
	public static double convert(double temperature){
		return (temperature * Double.valueOf(9)/ Double.valueOf(5)) + 32;
	}
}