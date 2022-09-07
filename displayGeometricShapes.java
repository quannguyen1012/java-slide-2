import java.util.Scanner;

public class displayGeometricShapes {
    public static String Rectangle() {
        String result = "";
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 5 ; j++) {
                result += "*" + "   ";
            }
            result += "\n";
        }
        return result;
    }
    public static String triangleTop() {
        String result = "";
        for (int i=5; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                result += "*" + "  ";
            }
            result += "\n";
        }
        return result;
    }
    public static String triangleBotton() {
        String result = "";
        for (int i=0; i <= 5; i++) {
            for (int j=0; j <= i ; j++) {
                    result += "*" + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");

            System.out.println("Enter Selection");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(Rectangle());
                    break;
                case 2:
                    System.out.println(triangleBotton());
                    break;
                case 3:
                    System.out.println(triangleTop());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("entered wrong");
                    break;
            }
        }

    }
}
