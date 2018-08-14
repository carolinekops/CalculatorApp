//Calculator using exception handling 
//***8/8/2018***
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first number?");
		int num1 = keyboard.nextInt();
		System.out.println("What is your second number?");
		int num2 = keyboard.nextInt();
		Calculate(num1,num2);
	}

	static void Calculate(int num1, int num2) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Do you want to Add, Subtract, Multiply or Divide? Enter A, S, M or D.");
	String userInput = keyboard.nextLine();
		switch(userInput) {
		case "A": {
			System.out.println(num1*num2);
			break;
		}
		case "S": {
			System.out.println(num1-num2);
			break;
		}
		case "M": {
			System.out.println(num1*num2);
			break;
		}
		case "D": {
			try {
				System.out.println(num1/num2);
		}
			catch(ArithmeticException e) {
				System.out.println("You cannot divide by zero. Try again.");
			}
			break;
		}
		}
		
}
}
