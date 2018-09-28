import java.util.Scanner;

public class p02TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.next());
        int y1=Integer.parseInt(scanner.next());
        scanner.nextLine();
        int x2 = Integer.parseInt(scanner.next());
        int y2=Integer.parseInt(scanner.next());
        scanner.nextLine();
        int x3 = Integer.parseInt(scanner.next());
        int y3=Integer.parseInt(scanner.next());

        int area = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);

        System.out.println(area);
    }
}
