// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomer {

    public static void main(String[] args) {

        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };

        int [][] accounts2 = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {

        int maxWealth =Integer.MIN_VALUE;

        for (int [] acc : accounts){

            int individualWealth = 0;

            for (int num : acc){
                individualWealth += num;
            }

            if (individualWealth > maxWealth){
                maxWealth = individualWealth;
            }

        }

        return maxWealth;
    }

}


