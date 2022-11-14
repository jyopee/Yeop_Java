package homework1111_1;

public class Employee {
	public String name;
	public int Salary;

	public Employee(String name, int Salary) {
		this.name = name;
		this.Salary = Salary;

	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return Salary;
	}

	public void getInformation() { // 이름과 연봉을 출력하는 기능
		System.out.println("이름 :" + name);
		System.out.println("연봉 :" + Salary);
	}

	public void print() { // "수퍼클래스"란 문구를 출력하는 기능
		System.out.println("수퍼클래스 !");
	}

}
