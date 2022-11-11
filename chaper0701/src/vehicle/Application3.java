package vehicle;

public class Application3 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		
		Texi taxi = new Texi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
