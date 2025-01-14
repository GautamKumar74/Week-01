public class CourseFee{
	public static void main(String[] args){
		int fee= 125000;
		float discountPercent= 10;
		int discount= (int)((discountPercent/100)*fee);
		int amountToPay= (int)(fee-discount);
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountToPay);
	}
}