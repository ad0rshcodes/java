import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int tempNumber = inp.nextInt();
        int reverseNumber = 0;

        while (tempNumber > 0){
            int rem = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + rem;

            tempNumber = (tempNumber - rem)/ 10;
        }
        System.out.println(reverseNumber);
    }

}
