// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {

    public static void main(String[] args) {

        int [] nums = {12,345,2,6,7896};

        int count = findNumbers(nums);

        System.out.println(count);
    }

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int v = ((int) (Math.log10(nums[i])) + 1) % 2;

            if (v == 0.0){
                count++;
            }

        }
        return count;
    }
}
