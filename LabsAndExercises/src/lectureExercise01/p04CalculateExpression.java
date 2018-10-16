package lectureExercise01;

import java.util.Scanner;

public class p04CalculateExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double averageABC = (a+b+c)/3;

        double pow = (a+b+c)/Math.sqrt(c);
        double f1 = Math.pow(((a*a+b*b)/(a*a-b*b)),pow);
        double f2 = Math.pow((a*a + b*b -c*c*c),(a-b));

        double averageF1F2=(f1+f2)/2;
        double diff= Math.abs(averageABC-averageF1F2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);

    }
}
