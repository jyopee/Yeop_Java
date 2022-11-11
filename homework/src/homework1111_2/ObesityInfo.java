package homework1111_2;

public class ObesityInfo extends StandardWeightInfo {

	public double Obesity;

	public ObesityInfo(String name, int height, int width, double StandardWeight) {
		super(name, height, width, StandardWeight);

	}

	@Override
	public void getInformation() {
		
		getObesity();
		super.getInformation();
		System.out.printf("%s님의 신장%d 몸무게%d 비만율은%.2f ", name, height, width,Obesity);
		
	}

	public double getObesity(int width, double StandardWeight) {
		Obesity = (width - StandardWeight) / StandardWeight * 100;
		return Obesity;
	}
}
