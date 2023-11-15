import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {

        int [] nums = {123, 4764, 586549, 392834};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


        String [] names = {"Daksh", "Rajesh", "Asha"}; // Strings are immutable, not the String arrays. String arrays are nothing but ref var who could point to something else.
        changeString(names);
        System.out.println(Arrays.toString(names));
    }

    public static void change (int [] arr){
        arr[0] = 007;
    }

    public static void changeString (String [] arr){
        arr[0] = "Adarsh";
    }
}
