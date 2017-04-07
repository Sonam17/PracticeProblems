package array;

public class StockBuySellMutipleTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {100, 180, 260, 310, 40, 535, 695};
		stockSellBuy(price);
	}
	
	static void stockSellBuy(int[] price){
		int min = price[0];
		int diff = 0;
		int indexToBuy = 0;
		int indexToSell = 0;
		
		for(int i=0;i<price.length;i++){
			if(diff<(price[i]-min)){
				diff = price[i]-min;
				indexToSell = i;
			}
				
			if(min > price[i] || i==price.length-1){
				System.out.println("Buy at = "+indexToBuy+" and Sell at = "+indexToSell);
				diff = 0;
				min = price[i];
				indexToBuy = i;
			}
			
		}
		
	}

}

