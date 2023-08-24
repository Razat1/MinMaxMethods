import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter three numbers:");

        System.out.print("The first number is: ");
        float num1 = numbers.nextFloat();
        System.out.print("The second number is: ");
        float num2 = numbers.nextFloat();
        System.out.print("The third number is: ");
        float num3 = numbers.nextFloat();

        float minResult = minNum(num1, num2, num3);
        System.out.println("The minimum value is: " + minResult);

        float maxResult = maxNum(num1, num2, num3);
        System.out.println("The maximum value is: " + maxResult);
        //if statement checks if user has inputted a double value
        if (num1 % 1 != 0 || num2 % 1 != 0 || num3 % 1 != 0) {

            minNum(num1, num2, num3);
            maxNum(num1, num2, num3);

        } else {
            maxNum((int)num1, (int)num2,(int) num3);
            minNum((int)num1,(int) num2,(int) num3);
                    }
    }
    public static float minNum(float a, float b, float c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int minNum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static float maxNum(float a, float b, float c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int maxNum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
