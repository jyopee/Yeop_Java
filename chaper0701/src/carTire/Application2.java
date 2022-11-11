package carTire;

public class Application2 {

	public static void main(String[] args) {
		HankookTire hTire = new HankookTire("right",10);
		KumhoTire KTire = new KumhoTire("left",20);
		
		Tire tire =hTire;
		System.out.println(tire.roll());
		
		tire =KTire;
		System.out.println(tire.roll());
		
		tire =hTire;
		System.out.println(tire.roll());

	}

}
