import java.util.Scanner;

public class CountingOccurances {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        long inputNumber = inp.nextInt();
        int searchNumber = inp.nextInt();

        long num = inputNumber;
        int count = 0;

        while (num > 0){

            long rem = num % 10;
            if (rem == searchNumber){
                count++;
            }
            num = (num - num % 10)/10;
        }

        System.out.println(count);
    }
}
