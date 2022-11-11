package carTire;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(location + "한쿸 타이어 수명" + (maxRotation = accRotation) + "회");
			return true;

		}else {
			System.out.println(" ### " +location+"한쿸 타이어펑크 ###");
			return false;
	}
	
	
}
}
