package Aug_02;

import java.util.Scanner;

public class UsingSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String slot = sc.nextLine();

		switch (slot) {
			case "TG1" -> System.out.println("Morning");
			case "TG2" -> System.out.println("Evening");
			default -> System.out.println("Enter the slot for Java");
		}

		sc.close();
	}
}
