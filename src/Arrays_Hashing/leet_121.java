package Arrays_Hashing;

public class leet_121 {

    public int maxProfit(int [] price){
        int minprice = price[0];
        int maxprofit = 0;
        for (int i=1; i<=price.length-1; i++){
            if (price[i]<minprice){
                minprice = price[i];
            }else {
             int profit = price[i] - minprice;
             maxprofit = Math.max(profit , maxprofit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
      leet_121 obj = new leet_121();
      int [] prices = {7,1,5,3,6,4};
      int ans = obj.maxProfit(prices);
        System.out.println(ans);
    }
}
