import java.util.Scanner;

class simpleInterest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principle : ");
		double principle = scanner.nextDouble();
		System.out.println("Enter Rate : ");
		double rate = scanner.nextDouble();
		System.out.println("Enter Time : ");
		double time = scanner.nextDouble();

		System.out.println("Simple Interest : " + calculateInterest(principle, rate, time)); 
	}	
	public static double calculateInterest(double principle, double rate, double time){
		return Double.valueOf(principle * rate * time)/Double.valueOf(100);
	}
}