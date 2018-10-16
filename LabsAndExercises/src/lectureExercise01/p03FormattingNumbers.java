package lectureExercise01;

import java.util.Scanner;

public class p03FormattingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int intA = input.nextInt();
        double colThree = input.nextDouble();
        double colFour = input.nextDouble();


        String binA = Integer.toBinaryString(intA);

        StringBuilder colTwo = new StringBuilder();

        if (binA.length() >= 10) {
            colTwo.append(binA);
            colTwo.setLength(10);

        } else {
            int fillUpSize = 10 - binA.length();
            String fillUp = new String(new char[fillUpSize]).replace("\0", "0");

            colTwo.append(fillUp);
            colTwo.append(binA);
        }

        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", intA, colTwo, colThree, colFour);
    }
}