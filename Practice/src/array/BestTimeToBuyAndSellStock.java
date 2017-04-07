package array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 1, 5, 3, 6, 4}; 
		System.out.println("Max Profit = "+maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
	       if(prices.length>1){
	        int min = prices[0];
	        int indexToSell=0;
	        int indexToBuy=0;
	        int diff = 0;
	        for(int i=1;i<prices.length;i++){
	            if((prices[i]-min)>diff){
	                indexToSell = i;
	                diff = prices[i]-min;
	            }
	            if(min>prices[i]){
	                indexToBuy = i;
	                min = prices[i];
	            }
	        }
	        System.out.println("Buy on = "+indexToBuy+" && Sell on = "+indexToSell);
	        return diff;
	       }
	      return 0;
	 }

}

