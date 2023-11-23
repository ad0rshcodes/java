import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/description/

public class SpiralMatrix {

    public static void main(String[] args) {
        
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        
        int row = 0;
        int col = 0;
        int csize = matrix[0].length;
        int rsize = matrix.length;

        ArrayList <Integer> arr = new ArrayList<>();

        for (int i = col; i < csize; i++){
            arr.add(matrix[row][i]);
            // row++;
            col++;
        } 

        row++;

        for (int i = row; i < rsize; i++){
            arr.add(matrix[i][col]);
            row++;
        }

        col--;

        for (int i = col; i > ; i++) {

        }

        System.out.println(arr);

        for (int i = 0)

    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        
        int row = 0;
        int col = 0;
        int csize = matrix[0].length;
        int rsize = matrix.length;

        ArrayList <Integer> arr = new ArrayList<>();

        for (int i = col; i < col + csize; i++){
            arr.add(matrix[row][i]);
            col++; // 3
        } 

        row++; //1
        rsize--; //4


        for (int i = row; i < rsize; i++){
            arr.add(matrix[i][col]);
            row++; // 4
        }

        col--; // 2
        csize--; //3


        for (int i = col; i > ; i--) {
            


            c--;
        }

        r--;
        rsize--; //3

        System.out.println(arr);

        for (int i = 0)

    }
}
