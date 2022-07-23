import java.util.Scanner;

import com.virtusa.ValidParentheses.controller.ParenthesesController;

public class Main {
	
	public static void main(String[] args) {
		
		ParenthesesController controller = new ParenthesesController();
		Scanner sc = new Scanner(System.in);
		String userString = sc.nextLine();
		
		System.out.println(controller.validateUserParentheses(userString));
	
	}
}
