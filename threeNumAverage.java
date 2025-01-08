import java.util.Scanner;

class threeNumAverage{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double n1 = scanner.nextDouble();
		System.out.println("Enter second number : ");
		double n2 = scanner.nextDouble();
		System.out.println("Enter third number : ");
		double n3 = scanner.nextDouble();

		System.out.println("Average is : " + average(n1, n2, n3));
	}	
	public static double average(double num1, double num2, double num3){
		return (num1 + num2 + num3)/Double.valueOf(3);
	}
}