package homework1111_1;

public class EmpDept extends Employee {

	public String dept="교육부";

	public EmpDept(String name,int Salary ) {
		super(name,Salary);
		
	}

	public String getEmpdept() {
		return dept;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 :" + dept);

	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스 !");
	}

}
