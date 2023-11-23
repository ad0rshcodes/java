import java.util.Arrays;

public class Main {
    
    public static void main(String [] args) {
        
        int [] args2 = {5,4,3,2,1};
        int [] args3 = {7,8,9,10,11};
        

        binarySearch(args2);
        binarySearch(args3);

    }


    public static void binarySearch(int [] arr){

        boolean swapped;

        for( int i = 0; i < arr.length - 1; i++){

            swapped = false;

            for(int j = 1; j < arr.length - i ; j++){
                
                if (arr[j] < arr [j-1]){
                    int temp = arr[j];

                    arr [j] = arr [j-1];
                    arr [j-1] = temp;
                }
                swapped = true;
            }

            if (!swapped){
                break;
            }

        }


        System.out.println(Arrays.toString(arr));
    }
}
