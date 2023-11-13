import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int inputNumber = inp.nextInt();

        boolean result = checkPrime(inputNumber);

        System.out.println(result);
    }

    private static boolean checkPrime(int x){

        if (x == 2){
            return true;
        }
        else{
            for (int i = 2; i*i <= x; i++) {
                if (x % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

}


