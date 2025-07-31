// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 

public class Problem3 {

    public static int Solution(int nums[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(buyPrice < nums[i]){
                int profit = nums[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = nums[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit will be "+Solution(nums));
    }
}
