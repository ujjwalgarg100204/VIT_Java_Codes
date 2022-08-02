import java.io.*;
import java.util.*;
import java.lang.*;

public class PrintYourNameFromCommandLineInput {
	public static void main(String[] args) {
		if (args.length == 2)
			System.out.println(args[0] + " " + args[1]);
		else 
			System.out.println("Not enough arguments");
	}
}