import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {

        int [][] arr = new int [3][]; //adding number of columns isn't mandatory. It could have variable column numbers

        int [][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8},
                {9,10,11,12}
        };

        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

        // print a 2D array with variable column length.

        for (int [] num : arr2){
            for (int a: num){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // take input for an array with "for each" loop.

        int [][] arr3 = new int [2][2];
        Scanner inp = new Scanner(System.in);

        // this method of using for-each loop to modify array won't work because for-each loop is a read only loop and works with the copied values of that array and the original references themselves.

        for (int [] a : arr3){
            for (int b : a){
                b = inp.nextInt();
            }
        }

        for (int [] num : arr3){
            for (int a: num){
                System.out.print(a + " ");
            }
            System.out.println();
        }

         /* take input for a array with variable column length. */

    }
}
