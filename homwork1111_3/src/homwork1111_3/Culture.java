package homwork1111_3;

import java.util.Scanner;

public abstract class Culture {

	public int directors;
	public int Actors;
	public int Crowd[] = null;
	public int score = 0;
	public String avgScore = "";

	public Culture(int directors, int Actors, int Crowd) {

		this.directors = directors;
		this.Actors = Actors;
		this.Crowd = new int[Crowd];
		


	}

	public void setTotalScore(int score) {

		Scanner input = new Scanner(System.in);

		int perScore = 0;

			
		for (int i = 0; i < Crowd.length; i++) {
			System.out.println((i+1)+"번쨰 평점을 입력하세요");
			perScore = Integer.parseInt(input.nextLine());
			Crowd[i] = perScore;

		}

		for (int j = 0; j < Crowd.length; j++) {
			score += Crowd[j];
		}

		this.score =score;
		
		
	} // : 관객수와 총점을 누적시키는 기능

	public String getGrade() {

		
		
		if (score / Crowd.length >= 50) {
			avgScore = "☆☆☆☆☆";
		} else if (score / Crowd.length >= 40) {
			avgScore = "☆☆☆☆";
		} else if (score / Crowd.length >= 30) {
			avgScore = "☆☆☆";
		} else if (score / Crowd.length >= 20) {
			avgScore = "☆☆";
		} else {
			avgScore = "☆";
		}
		return avgScore;

		

	} // : 평점을 구하는 기능

	public abstract void getInformation();
		
	
	
	// : 정보를 출력하는 추상메소드

}
