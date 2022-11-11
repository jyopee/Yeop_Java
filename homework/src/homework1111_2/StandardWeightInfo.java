package homework1111_2;

public class StandardWeightInfo extends Human {


	public double StandardWeight;
	
	public StandardWeightInfo(String name, int height, int width, double standardWeight) {
		super(name, height, width);
		
	}
	

	
	@Override
	public void getInformation() {

	
		System.out.printf("%s님의 신장%d 몸무게%d 표준체중은%.2f ", name, height, width, getStandardWeight(height));

	}

	public double getStandardWeight(int height) { // : 표준체중을 구하는 기능

		StandardWeight = (height - 100) * 0.9;

		return StandardWeight;

	}// ( * 표준 체중 : (Height - 100) * 0.9 )

}
