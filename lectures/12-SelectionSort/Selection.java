// import java.util.Arrays;


// public class Selection{
//     public static void main(String[] args) {
        
//         int [] arr = {5,44,31,2,18};
//         selection(arr);

//     }


//     public static void selection (int [] arr){

        

//         for (int i = 0; i < arr.length; i++){

//             int index = 0;
//             int max = Integer.MIN_VALUE;

//             for (int j = 0; j < arr.length - i; j++){

//                 if (arr[j] > max){
//                     max = arr[j];
//                     index = j;
//                 }
//             }

//             arr[index] = arr[arr.length - i - 1];
//             arr [arr.length - i - 1] = max;

//             System.out.println(Arrays.toString(arr));
//         }

//         System.out.println(Arrays.toString(arr));

//     }

// }