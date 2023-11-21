public class SaerchIn2DArray {

    public static void main(String[] args) {

        int [][] arr = {
                {23, 4, 1},
                {18,12,3,9},
                {3483, 2371, 423418, 48574}
        };

        int num = 423418;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == num){
                    System.out.println(i + "," + j);
                }

            }

        }
    }



}
