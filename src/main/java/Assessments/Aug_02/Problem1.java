package Assessments.Aug_02;

public class Problem1 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage java Aug02 <first_name> <last_name>");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];

        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);

        final double BMI = weight / (height * height);

        System.out.printf("%s %s: %s\n", firstName, lastName, bmiCategory(BMI));
    }

    static String bmiCategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal (healthy weight)";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese Class";
    }

}
