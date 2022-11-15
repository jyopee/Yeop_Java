package test2;

public class DGBCard extends Card{

	public final static String company = "DaeguBank";
	public String cardstaff;
	
	public DGBCard (String cardNo, int vaildDate, int CVC,String cardstaff) {
		super(cardNo,vaildDate,CVC);
		this.cardstaff =cardstaff;
	}
	
	
	
	@Override
	public void showCardInfo() {
		super.showCardInfo();
//		System.out.printf("카드정보 (CardNo :%s, 유효기간 :%d. CVC :%d )",cardNo,vaildDate,CVC);
		System.out.printf("담당직원 - %s,%s",cardstaff,company);
		
	}
	
}
