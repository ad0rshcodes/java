import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Please enter some input.");
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();

        System.out.println("your roll no. is: " + rollNo);


        String name = input.next();
        System.out.println(name);

        //input is basically an object which will take inputs from the keyboard.
    }
}
