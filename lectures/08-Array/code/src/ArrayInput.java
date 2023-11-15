import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= inp.nextInt();
        }

        System.out.println(Arrays.toString(arr)); // convert arrays to string and then print.


        //For Each Loop

        for (int num: arr) { // here num represents each element in an array
            System.out.print(num + " ");
        }


        // array of objects.

        String [] names = new String [3];
        names[0] = "adarsh";
        names[1] = "hsbhsbx";
        names[2] = "chsdhbd";

        for (String ele : names){
            System.out.println(ele);
        }


    }
}
