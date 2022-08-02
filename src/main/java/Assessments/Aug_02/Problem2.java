import java.util.*;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		double result;
		switch(operator) {
			case '-':
				result = firstNum - secondNum;
				break;
			case '+':
				result = firstNum + secondNum;
				break;
			case '*':
				result = firstNum * secondNum;
				break;
			case '/':
				result = firstNum / secondNum;
				break;
			default:
				System.out.println("Enter valid operator");
				result = 0;
		}
		
		System.out.println(result);
	}
}
