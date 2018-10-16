package lectureExercise01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p01RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int area = a*b;

        DecimalFormat df = new DecimalFormat("#.00"); // Set your desired format here.
        System.out.println(df.format(area));
    }
}
