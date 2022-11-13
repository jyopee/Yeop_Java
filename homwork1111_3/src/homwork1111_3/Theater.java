package homwork1111_3;

import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {


		
		
		
		
		System.out.println("관중의 수를 입력하세요");
		Scanner input = new Scanner(System.in);
		int People = input.nextInt();
		Culture obj = new Movie("추격자",7,5,People);
	
		obj.getInformation();
		
		System.out.println("관중의 수를 입력하세요");
		int People2 = input.nextInt();
		Culture obj2 = new Performance("지킬엔 하이드",9,10,People2);
//		영화 제목,감독수,배우수,관중수,평점
		
		obj2.getInformation();
		
	}

}
