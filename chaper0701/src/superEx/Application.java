package superEx;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperAireplane sa = new SuperAireplane();
		
		sa.takeoff();
		
		sa.fly();
			
		sa.flymode=SuperAireplane.SUPERSONIC;
		
		sa.fly();
		
		sa.flymode=SuperAireplane.NORMAL;
		
		sa.fly();
		
		sa.land();
		
	}

}
