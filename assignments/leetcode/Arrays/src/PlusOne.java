// problem link: https://leetcode.com/problems/plus-one/description/


import java.sql.SQLOutput;
import java.util.Arrays;

//solution:
public class PlusOne {
    public static void main(String[] args) {

        int [] input = {9,9,9};
        System.out.println(Arrays.toString(plusOne(input)));
    }
    public static int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--){
                if (digits[i] != 9){
                    digits[i] += 1;
                    break;
                }

                else{
                    digits[i] = 0;
                    if (i == 0){
                        int [] newArr = new int [digits.length + 1];
                        newArr[0] = 1;
                        return newArr;
                    }
                }
            }

            return digits;

    }
}
