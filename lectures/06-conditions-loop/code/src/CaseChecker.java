import java.util.Scanner;

public class CaseChecker {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char input = inp.next().charAt(0);


        if (input > 64 && input < 91)
        {
            System.out.println("uppercase");
        }
        else{
            System.out.println("lowercase");
        }
    }

}
