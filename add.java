import java.util.Scanner;
class add{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Result: " + add(num1, num2));
	}
	public static double add(double n1, double n2){
		return n1+n2;
	}
}