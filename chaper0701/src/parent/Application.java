package parent;

public class Application {

	public static void main(String[] args) {
		Child chd = new Child();
	
		//Parent parent = new Child();
//		부모 클래스에 있는 필드, 메소드룰 사용하되
//		만약 자식 클래스에 오버라이딩이 되어 있는 메소드가 존재한다면
//		부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드 사용
//		
		Parent parent = chd;
		
		parent.method1();
		parent.method2();
//		parent.method3();
//		

	}
}
