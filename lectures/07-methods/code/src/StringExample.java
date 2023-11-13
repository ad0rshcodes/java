import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String test1 = greeting("Namaste");
        System.out.println(test1);
        System.out.println(greeting2("Diwali"));
    }

    private static String greeting(String greet){
        return greet;
    }

    private static String greeting2 (String greet){
        Scanner inp = new Scanner(System.in);
        String greetInput = inp.nextLine();

        return greetInput + " " + greet;
    }
}