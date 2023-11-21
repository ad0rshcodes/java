// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

public class EvenDigits {
    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            double v = ((int) (Math.log10(nums[i])) + 1) % 2;

            if (v == 0){
                count++;
            }

        }
        return count;
    }
}
