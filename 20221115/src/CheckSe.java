
public class CheckSe {

	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		char sex;
		int male = 0;
		int female = 0;

		for (int i = 0; i < arr.length; i++) {

			sex = arr[i].charAt(7);

			if (sex == '1' || sex == '3') {
				male += 1;
			} else if (sex == '2' || sex == '4') {
				female += 1;
			}
		}

		System.out.printf("남 : %d / 여 : %d", male, female);

	}

}
