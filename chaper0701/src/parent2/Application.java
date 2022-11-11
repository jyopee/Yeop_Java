package parent2;

public class Application {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method - child 변환성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
//	public static void method2(Parent parent) {
//		if(Child child =(Child)parent) {
//		System.out.println("method2 =child 변환 성공");
//	}else {
//		System.out.println("변환 실패");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child();
		method1(parent);
		
//		Parent parent1 = new Parent();
//		method2(parent);
//		
		
		
		parent.field ="parent";
		parent.method1();
		parent.method2();
		
//		parent.field2="child";
//		parent.method3();
//		
		//Casting
		
		Child child = (Child)parent;
		child.field="parent";
		child.method3();
		
		child.field="parent";
		
		Parent parentA = new Child();
		method1(parentA);
	}

}
