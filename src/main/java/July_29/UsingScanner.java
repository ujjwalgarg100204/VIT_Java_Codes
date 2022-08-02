import java.io.*;
import java.util.*;

public class UsingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regNo = sc.next();
		sc.nextLine();
		String name = sc.nextLine();
		double cgpa;
		if (sc.hasNextDouble()) {
			cgpa = sc.nextDouble();
			System.out.println("Your name is " + name + "\nAnd your register number is " + regNo 
			+ "\nAnd your CGPA is " + cgpa + ".\n");
		} else {
			System.out.println("You didn't enter a valid CGPA");
		}
				
		sc.close();
	}
}