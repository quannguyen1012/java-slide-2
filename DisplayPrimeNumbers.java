import java.util.Scanner;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int number = 70, count = 0;
        int N = 2;
        boolean check = true;
        String a = "";

        while (count < number) {

            for (int i = 2; i < N; i++) {
                if(N % i != 0){
                    check = true;
                }
                if(N % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check == true) {
                a += N + ", ";
            }
            N++;
            count++;
        }
        System.out.println(a);
    }
}
