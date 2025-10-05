import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter First number : ");
			double num1 = sc.nextDouble();

			System.out.print("Select any Operator ( + , - , *, / ) : ");
			char opr = sc.next().charAt(0);

			System.out.print("Enter Second number : ");
			double num2 = sc.nextDouble();

			double result = 0;

			switch (opr) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("Invalid, second number can't be zero");
					} else {
						result = num1 / num2;
					}
					break;
				default:
					System.out.println("please select correct operator");
					break;
			}
			System.out.println("Result is " + result);
			System.out.println("Do you want to calculate again : y/n");
			if (sc.next().charAt(0) == 'n') {
				System.out.println("Calculator closed, Bye!");
				break;
			}
		}

	}
}