// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

public class MaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxOnes = 0;
        int x = 0;

        while (x < nums.length){

            if (nums[x] == 1){
                int count = 0;
                while ((x < nums.length) && (nums[x] == 1)){
                    count++;
                    x++;
                }

                if (count > maxOnes){
                    maxOnes = count;
                }
            }
            else{
                x++;
            }
        }

        return maxOnes;

    }
}