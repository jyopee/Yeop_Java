package test2;

public class TossCard extends Card{

	public final static String company = "Toss";
	public String cardstaff;
	
	public TossCard (String cardNo, int vaildDate, int CVC,String cardstaff) {
		super(cardNo,vaildDate,CVC);
		this.cardstaff =cardstaff;
	}
	
	
	
	@Override
	public void showCardInfo() {
		System.out.printf("카드정보 : CardNo :%s",cardNo);
		System.out.println();
		System.out.printf("담당 지원 :%s,%s",cardstaff,company);
		System.out.println();
	}
	
}
