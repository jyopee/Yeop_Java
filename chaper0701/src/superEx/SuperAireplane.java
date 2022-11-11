package superEx;

public class SuperAireplane extends AirePlane{

	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	public int flymode = NORMAL;

	@Override
	public void fly() {
		if(flymode == SUPERSONIC ) {
			System.out.println("초음속 비행중입니다.");
		}else {
			super.fly();
		}
	}
	
	
	public void test() {
		super.fly();
	}
	
	
}
