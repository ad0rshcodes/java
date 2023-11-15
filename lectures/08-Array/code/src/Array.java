import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        /* syntax:

        datatype [] variable_name = new datatype [size of that array]

        eg: String [] names = new String [5];

        OR

        you can directly write this as:

        int [] rollnos = {1,2,3,4,5};

        */

        int [] numArray = new int [5]; // "int [] numArray" happens at compile time and "new int [5]" happens at run-time.
        System.out.println(numArray);


        // How do arrays work?

        int [] rollnos; //declaration: "rollnos" is a ref. variable and is created in stack memory.

        rollnos = new int [10]; //initialisation: actual object is created in heap memory.

        System.out.println(rollnos);


        // for an integer array, it's gonna have all values as 0 initially.
        int[] nums = new int [5];
        System.out.println(nums[2]); // prints 0


        // in case non-primitive arrays, the default value = null.
        String[] names = new String[10];
        System.out.println(names[2]); //prints null.


    }
}