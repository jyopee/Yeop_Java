package homwork1111_3;

public class Movie extends Culture {

	public String genre;

	public Movie( String genre,int directors, int Actors, int Crowd) {
		super(directors, Actors, Crowd);
		this.genre = genre;
		
	}

	public void getInformation() {

		super.setTotalScore(score);
		System.out.println("======================");
		System.out.println("영화 제목 :" + genre);
		System.out.println("영화 감독 :" + directors);
		System.out.println("배우 :" + Actors);
		System.out.println("영화 총점 :" + score);
		System.out.println("영화 평점 :" + super.getGrade());
		System.out.println("======================");

	} // : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

}
