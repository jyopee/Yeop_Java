package homework1114;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)
//		String str = "abc";
//
//		for (int i = str.length()-1; i >= 0; i--) {
//			
//			System.out.print(str.charAt(i));
//
//		}

		// 2)

		byte[] bytes = null;
		String str2 = "1a2v4b";
		int cnt1 = 0;
		int cnt2 = 0;

		bytes = str2.getBytes();
		for (int i = 0; i < str2.length(); i++) {
			if (48 < bytes[i] && 57 > bytes[i]) {
				cnt1 += 1;
			} else if (65 < bytes[i] && 122 > bytes[i]) {
				cnt2 += 1;
			}


		}
		System.out.println("숫자" + cnt1);
		System.out.println("영어" + cnt2);

		// 3) 입력한 생년월일 6자리를 입력하였을때 경우 만 나이를 구하는 프로그램 작성
		// 조건 금년 기준으로 100년이 넘어간 경우는 제외한다.
		
		String birth = "990802";
		int age = 2022;
		

		String firstNum = birth.substring(0, 2);
		String Birth = birth.substring(5, 6);
		



	
		

	}

}
