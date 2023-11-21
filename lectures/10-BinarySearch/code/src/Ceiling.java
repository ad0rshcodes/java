// Ceiling of a given number is a number >= target number

public class Ceiling {

    public static void main(String[] args) {

        int [] arr = {2,3,5,6,9,14,18,20};
        System.out.println(findCeiling(arr, 10) + " " + arr[findCeiling(arr, 10)]);
    }

    private static int findCeiling (int [] arr, int target){

        int l = 0;
        int r = arr.length - 1;

        while (l <= r){

            int mid = l + ((r - l) / 2);

            if (arr[mid] > target){
                r = mid - 1;
            }
            else if (arr[mid] < target) {
                l = mid + 1;
            }
            else {
                return mid;
            }
        }

        return l;
    }
}
