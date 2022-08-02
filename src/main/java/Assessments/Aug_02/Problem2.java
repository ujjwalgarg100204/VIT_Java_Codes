package Assessments.Aug_02;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        String operator = sc.next();

        double result;
        switch (operator) {
            case "-" -> result = firstNum - secondNum;
            case "+" -> result = firstNum + secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
            default -> {
                System.out.println("Enter valid operator");
                result = 0;
            }
        }

        System.out.println(result);
    }
}
