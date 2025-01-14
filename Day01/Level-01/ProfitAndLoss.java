public class ProfitAndLoss{
	public static void main(String[] args){
		int costPrice= 129;
		int sellingPrice= 191;
		double profit= sellingPrice-costPrice;
		double profitPercentageDecimal= (profit/costPrice)*100;
		int profitPercentage= (int)profitPercentageDecimal;
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR "+ sellingPrice + "\n" + "The Profit is INR " + profit +" and the Profit Percentage is " + profitPercentage);
	}
}