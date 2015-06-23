import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		ApplicationControllerPattern deligate = new ApplicationControllerPattern();
		String add = "Add";
		String subtract = "Subtract";
                String Divide = "Divide";
		String Multiply = "Multiply";
		Integer num1 = -5;
		Integer num2 = 5;
		String command;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num1 = Integer.parseInt(in.nextLine());
		System.out.println("Enter a command (+, -, *, /): ");
		command = in.nextLine();
		System.out.println("Enter another number: ");
		num2 = Integer.parseInt(in.nextLine());
		
		System.out.print(num1 + " " + command + " " + num2 + " = ");
		deligate.handleCommand(command, num1, num2);
		
	}
	
}



//Idea from Ben Olivas group. I can take this and use a similar idea for myself
