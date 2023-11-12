import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 0; i < n-2; i++) {
            int c = a+b;
            a = b;
            b= c;
        }

        System.out.println(b);
    }
}
