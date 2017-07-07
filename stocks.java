//done by Krishna Kanth
/**Given the daily stock prices of a share during last 30 days, write a program to find out best buying and selling dates for maximum gain. 
 for ex: index 0   1  2  3  4  5  6
 int[] array= {10,05,04,12,32,04,35};
in this case, buying at index 5 and selling at index 6, would give you the max price gain of 31(35-04) */

public class stocks {

	public static void main(String[] args) {
		
		int[] prices= {10,05,04,12,32,04,35,67,27,12,03,56,24,12,01,16,72,126,147,89,93,64,42,10,05,07,14,32,45,30};
		
		int maxProfit=0;
		int BuyingDay=0,SellingDay=0;
		String profitPerShare=null;
		for(int i=0;i<prices.length;i++){
			for(int j=i+1;j<prices.length;j++){
				if(prices[j]-prices[i]>maxProfit){
					maxProfit=prices[j]-prices[i];
					BuyingDay=i+1;
					SellingDay=j+1;
					profitPerShare="("+Integer.toString(prices[j])+" - "+Integer.toString(prices[i])+" = "+Integer.toString(prices[j]-prices[i])+")";
				}
			}
		}
		System.out.println("Buy analysing the past 30 days stock prices we found that you could gain more profit");
		System.out.println("If you buy stock on day "+BuyingDay+" and sell your shares on "+SellingDay);
		System.out.println("The profit that you could gain per share is "+profitPerShare);
		

	}

}
