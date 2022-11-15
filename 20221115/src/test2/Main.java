package test2;

public class Main {

	public static void main(String[] args) {
	
		Card cardInfo = new Card("5432-4567-9534-3657",20251203,253);
		cardInfo.showCardInfo();
		System.out.println("========================");
		Card cardInfo1 = new TossCard("5432-4567-9534-3657",20251203,253,"신빛용");
		cardInfo1.showCardInfo();
		System.out.println("========================");
		Card cardInfo2 = new DGBCard("5432-4567-9534-3657",20251203,253,"신빛용");
		cardInfo2.showCardInfo();
	}

}
