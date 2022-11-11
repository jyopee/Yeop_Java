package homework1111_2;

public class Human {
	
	public String name;
	public int height;
	public int width;
	
	public Human(String name,int height,int width) {//	- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
		this.name=name;
		this.height=height;
		this.width=width;
	}

	public void getInformation() { // 이름, 키와 몸무게를 출력하는 기능
		System.out.printf("%s님의 신장%d 몸무게%d ",name,height,width);
	}

	


}

