// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestLetter {
    public static void main(String[] args) {

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;

        if (letters [r] <= target){
            return letters [0];
        }

        while (r >= l){
            int m = l + (r-l)/2;

            if (letters[m] > target){
                r = m - 1;
            }
            else if (letters[m] < target){
                l = m + 1;
            }
            else{
                l = m + 1;

                while (l < letters.length){
                    if (letters [l] > target){
                        return letters[l];
                    }
                    else {
                        l++;
                    }
                }

            }
        }

        return letters[l];
    }
}
