package test3;

public class CardPayment implements Payment{
	

	public double cardRatio;

	public CardPayment(double cardRatio) {

		this.cardRatio = cardRatio;
	
	}
	
	@Override
	public int online(int price) {
		double AvgRatio=1.00;
		int SalePrice=0;
		
		SalePrice = (int) (price * (AvgRatio-(ONLINE_PAYMENT_RATIO+cardRatio)));
		
		
		return SalePrice;
	}
	
	@Override
	public int offline(int price) {
		double AvgRatio=1.00;
		int SalePrice=0;
		
		SalePrice = (int) (price * (AvgRatio-(OFFLINE_PAYMENT_RATIO+cardRatio)));
		
		
		return SalePrice;
	}
	
	@Override
	public void showInfo() {
		System.out.println("***카드로 결제시 할인 정보");
		System.out.println("온라인 결제 할인율 : "+(ONLINE_PAYMENT_RATIO+cardRatio));
		System.out.println("오프라인 결제 할인율 : "+(OFFLINE_PAYMENT_RATIO+cardRatio));
	}
	
	
	
}
