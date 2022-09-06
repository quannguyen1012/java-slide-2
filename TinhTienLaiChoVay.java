import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Amount of Loans: ");
        int amountOfLoans = s.nextInt();

        System.out.println("Enter annual interest rate (%năm): ");
        double interestRateByMonth = s.nextDouble();

        System.out.println("Enter number of loan months: ");
        int numberOfLoanMonths = s.nextInt();

        double profit = amountOfLoans * interestRateByMonth / 100 / 360 * (numberOfLoanMonths * 30);

        System.out.println(profit);
    }
}
