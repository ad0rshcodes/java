import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int inputNumber = inp.nextInt();

        boolean result = checkArmstrongNumber(inputNumber);

        System.out.println(result);
    }

    private static boolean checkArmstrongNumber(int x){

        int temp = x;

        int calculateNumber = 0;

        while (x > 0){
            int rem = x % 10;
            calculateNumber += (int) Math.pow(rem, 3);
            x = (x - rem)/10;
        }

        System.out.println(calculateNumber);

        return calculateNumber == temp;
    }
}
