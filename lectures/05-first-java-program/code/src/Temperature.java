import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner scaleInput = new Scanner(System.in);
        String scale = scaleInput.next();
        Temperature t = new Temperature();
        double tempValue = t.tempInput();

        if (scale.equals("C") || scale.equals("c")){
            System.out.println("Your temperature in Fahrenheit is:" + ((18/10.0)*tempValue+32));
        }
        else{
            System.out.println("Your temperature in Celcius is:" + ((10/18)*(tempValue-32)));
        }

    }

    private double tempInput(){
        System.out.println("Enter Today's Temperature: ");
        Scanner input = new Scanner(System.in);
        double tempValue = input.nextDouble();
        return tempValue;
        // return (input.nextDouble)
    }
}