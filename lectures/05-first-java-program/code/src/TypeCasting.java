import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        // explicit typecasting
        int a = (int) 35.56;
        System.out.println(a);

        // automatic type promotion in expressions
        int b = 257;
        char c = (char) b; // taking ascii values into consideration
        System.out.println(c);

        int d = 257;
        byte e = (byte) (d);
        System.out.println(e);


        byte f = 42;
        char g = 'a';
        short h = 1024;
        int i = 50000;
        float j = 5.67f;
        double k = 0.1234;

        double result = (j * f) + (i / g) - (k * h); // f will be typecasted to float. char g to int. short h to double.
        // float + int - double = double
        System.out.println(result);

    }

}
