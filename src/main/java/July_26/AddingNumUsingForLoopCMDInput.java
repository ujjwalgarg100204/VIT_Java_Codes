package July_26;

public class AddingNumUsingForLoopCMDInput {
    public static void main(String[] args) {
        int sum = 0;
        for (String i : args) {
            sum += Integer.parseInt(i);
        }

        System.out.println(sum);
    }
}
