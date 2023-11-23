public class Random {
    public static void main(String[] args) {

        int [] arr = {10,273, 3646, 12731, 21663};

        System.out.println (binarySearch(arr, 21663));
    }



    public static int binarySearch (int [] arr, int target){
        
        int l = 0;
        int r = arr.length - 1;

        
        while (r >= l){

            int m = r - (r-l)/2;

            if (arr[m] == target){
                return m;
            } 
            else if (arr[m] > target){
                r = m -1;
            }
            else{
                l = m + 1;
            };
        }

        return -1; 
    }
}
