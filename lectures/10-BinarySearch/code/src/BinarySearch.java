
public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(search2(arr, 22));
    }

    // search function written by me:
    public static int search(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end)/2; // (start + end) would exceed the int limits if edge cases.

        while (arr[mid] != target){ // this will run infinitely if the element isn't there.

            if (arr[mid] > target){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }

            mid = (start + end)/2;
        }


        return mid;
    }

    // Better Binary Sort function
    public static int search2 (int [] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while (end >= start){

            int mid = start + (end - start)/2;

            if (arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}