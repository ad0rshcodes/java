// https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5, 6};
        int k = 2;
        
        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    public static int [] rotate (int [] arr, int k){
        
        int rem = k % arr.length;

        int l = 0;
        int r = rem - 1;
        for (int i = 0; i < arr.length/2; i++){

            int temp = arr[i];
            arr [i] = arr[arr.length - i - 1];
            arr[arr.length -i-1] = temp;
        }


        for (int i = 0; i < (rem)/2; i ++){
            
            int temp = arr[i];
            arr[i] = arr[(rem) - i - 1];
            arr[(rem) - i - 1] = temp;

        }


        l = rem;
        r = arr.length - 1;
        while (l < r){

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return arr; 
    }
    
}
