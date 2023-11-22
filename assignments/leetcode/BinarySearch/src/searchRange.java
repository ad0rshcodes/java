// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class searchRange {

    public static int [] solution (int[] nums, int target){

        int [] endPoints = {-1, -1};

        int r = nums.length - 1;
        int l = 0;

        while (r >= l){
            int mid = r - (r-l)/2;

            if (nums[mid] > target){
                r = mid - 1;
            }
            else if (nums[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
                endPoints[0] = r+1;
            };
        }

        r = nums.length - 1;
        l = 0;

        while (r >= l){
            int mid = r - (r-l)/2;

            if (nums[mid] > target){
                r = mid - 1;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else{
                l = mid + 1;
                endPoints[1] = l-1;
            };
        }


        return endPoints;
    }

}
