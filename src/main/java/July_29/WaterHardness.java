import java.util.*;

// Write a program to read from user the hardness of water in mg/L accordingly print its classification 

public class WaterHardness {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hardness = sc.nextInt();
		
		if (hardness >= 0 && hardness <= 60) 
			System.out.println("\"Soft\"");
		else if (hardness >= 61 && hardness <= 120) 
			System.out.println("\"Moderately hard\"");
		else if (hardness >= 121 && hardness <= 180) 
			System.out.println("\"Hard\"");
		else
			System.out.println("\"Very Hard\"");
		
		sc.close();
	}
}
