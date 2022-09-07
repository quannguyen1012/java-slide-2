
public class PrimeNumbers {
    public static void main(String[] args) {
        boolean check = true;
        String result = "";
        for(int i = 2; i <= 100; i++){
            for (int j = 2; j < i; j++){
                if(i % j != 0) {
                    check = true;
                }
                if(i % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check == true) {
                result += i + " ";
            }
        }
        System.out.println(result);
    }
}
