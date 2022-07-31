package July_26;

import java.io.*;
import java.util.*;
import java.lang.*;

public class AddNumFromCMDInput {
	public static void main(String[] args) {
		if (args.length == 2)
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		else 
			System.out.println("Not enough arguments");
	}
}