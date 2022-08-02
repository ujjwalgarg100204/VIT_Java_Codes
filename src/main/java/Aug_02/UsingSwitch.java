import java.util.*;

public class UsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String slot = sc.nextLine();
		
		switch(slot) {
			case "TG1":
				System.out.println("Morning");
				break;
			case "TG2":
				System.out.println("Evening");
				break;
			default:
				System.out.println("Enter the slot for Java");
		}
		
		sc.close();
	}
}
