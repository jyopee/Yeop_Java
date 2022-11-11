package carTire;

public class Application {

	public static void main(String[] args) {

		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemTire = car.run();

			switch (problemTire) {
			case 0:
				System.out.println("정상적으로 굴러갑니다");
				break;

			case 1:
				System.out.println("앞왼 한쿸 타이어 교체");
				car.frontLeftTire= new HankookTire("안왼쪽", 15);
				break;
				
				//frontLeftTire -> Tire
				//펑크
				//자식 클래스에 오버라이딩한 내용을 키루게 되는것
//				자동타입변환으로 인해서 가능한일
//				HankookTire = new HankookTire("안왼쪼ㄱ,15")
				//car.frontLestTitr=tire
			
			case 2:
				System.out.println("앞오른 금호타이어 교체");
				car.frontRightTire = new KumhoTire("앞오른", 13);
				break;

			case 3:
				System.out.println("뒤왼쪽 한쿸 타이어 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;

			case 4:
				System.out.println("뒤오른 금호 타이어 교체");
				car.backRightTire = new KumhoTire("뒤오른", 12);
				break;

			}
		}

	}

}
