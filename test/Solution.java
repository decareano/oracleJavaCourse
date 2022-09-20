/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mgobelli
 */
public class Solution {
    
    
        public static int maxProfit(int[] prices) {
            int minprice = Integer.MAX_VALUE;
            int maxProfit = 0;
            
            
            for (int i = 0; i < prices.length; i++) {
              
                //for (int j = i+1; j < prices.length; j++) {
                  
                     // below is gimmick (Integer.MAX_VALUE) to get the expression to return true
                        // and thus enter the if statement
                    // and be able to set minprice to the integers in the array
                        if (prices[i] < minprice) {
                            //System.out.println(prices[i] < minprice);
                            minprice = prices[i];
                            System.out.println(minprice);
                        } else if (prices[i] - minprice > maxProfit) {
                            maxProfit = prices[i] - minprice;
                            //System.out.println(maxProfit);
                        }
                       
                //} 
            
            }
            return maxProfit;
    
        }
    public static void main(String[] args) {
        int[] prices = {9,3,4,7,12,8};
        System.out.println(Solution.maxProfit(prices));
        
        
    }
    
}
