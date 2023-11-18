public class Main {
    public static void main(String[] args) {

        int [] arr = new int [5];
        arr[0]= 73462;
        arr[1] = 3842934;
        arr [2] = 3483474;
        arr [3] = 8457835;
        arr [4] = 231782;
        System.out.println(linearSearch(arr, 3483474));
    }

    private static int linearSearch(int [] arr, int n){

        for (int index = 0; index < arr.length; index++){
            if (arr[index] == n){
                return index+1;
            }
        }

        return -1;
    }
}