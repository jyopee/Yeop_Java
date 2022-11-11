package homework1111_2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human info = new StandardWeightInfo("홍길동",168,45,0);
		
		
		
		info.getInformation();
		info=new ObesityInfo("홍길동",168,45,0);
		System.out.println();
		info.getInformation();
		
	}

}
