package homwork1111_3;

public class Performance extends Culture {

	public String genre;

	public Performance(String genre,int directors, int Actors, int Crowd) {
		super(directors, Actors, Crowd);
		this.genre = genre;
	}

	public void getInformation() {
		super.setTotalScore(0);
		System.out.println("======================");
		System.out.println("영화 제목 :" + genre);
		System.out.println("영화 감독 :" + directors);
		System.out.println("배우 :" + Actors);
		System.out.println("영화 총점 :" + score);
		super.getGrade();
		System.out.println("영화 평점 :" + avgScore);
	}

}
