package test2;

public class Card {

	public String cardNo;
	public int vaildDate;
	public int CVC;

	public Card(String cardNo, int vaildDate, int CVC) {
		this.cardNo = cardNo;
		this.vaildDate = vaildDate;
		this.CVC = CVC;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getVaildDate() {
		return vaildDate;
	}

	public int getCVC() {
		return CVC;
	}
	
	public void showCardInfo() {
		System.out.printf("카드정보 (CardNo :%s, 유효기간 :%d. CVC :%d",cardNo,vaildDate,CVC);
		System.out.println();
	}

}
