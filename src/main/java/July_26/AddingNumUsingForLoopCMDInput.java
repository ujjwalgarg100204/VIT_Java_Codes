import java.io.*;
import java.util.*;
import java.lang.*;

public class AddingNumUsingForLoopCMDInput {
	public static void main(String[] args) {
		int sum = 0;
		for(String i: args) {
			sum += Integer.parseInt(i);
		}

		/*
		for(int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}

		*/
		
		System.out.println(sum);
	}
}
