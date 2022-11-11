package parent;

public class Child extends Parent {
	
	//필드
	public String lastName = "Paul";
	public int age =20;
	
	//생성자
	
	//메소드
	
	@Override
	public void method1() {
		System.out.println("child클래스 재정의 된 method1 호출");
	}
	
	public void method3() {
		System.out.println("child클래스 재정의 된 method13 호출");
	}
}
