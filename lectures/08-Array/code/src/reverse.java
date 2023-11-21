import java.sql.SQLOutput;
import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {

        String [] inputArray = {"fcxfscfx", "vcgdvcgdsvc", "dcbhdccs", "adarsh"};
        System.out.println(Arrays.toString(reverseArray(inputArray)));

    }

    public static String [] reverseArray (String[] arr){

        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }

        return arr;
    }

}
