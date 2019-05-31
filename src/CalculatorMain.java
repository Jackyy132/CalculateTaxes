import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] Jacky) {
		Scanner input = new Scanner(System.in);
		String UserChoice;
		do{			
			do(){
				System.out.println("Please enter your first number:");
				if (input.hasNextFloat()) {
					float firstNumber = input.nextFloat();
					input.nextFloat();
				}
				else {
					System.out.println("Nani, Please enter a number...");
				}
			}while();
			
			System.out.println("Please enter your second number:");
			float secondNumber = input.nextFloat();
			
			System.out.println("Which functionality do you want to do?");
			System.out.println("A. Addition");
			System.out.println("B. Subtract");
			System.out.println("C. Multiply");
			System.out.println("D. Divide");
			System.out.println("E. Exit program");
			System.out.println("Please type 1 of the letters above:");
			UserChoice = input.next().toUpperCase();
			
			if (UserChoice.equals("A")) {
				Calculator.Add(firstNumber, secondNumber);
			}
			if (UserChoice.equals("B")) {
				Calculator.Subtract(firstNumber, secondNumber);
			}
			if (UserChoice.equals("C")) {
				Calculator.Multiply(firstNumber, secondNumber);
			}
			if (UserChoice.equals("D")) {
				Calculator.Divide(firstNumber, secondNumber);
			}
		}while(!UserChoice.equals("E"));
	}
}
