package homework2;

public class PortableNotebook implements Notebook, Tablet {

	public int CURRENT_MODE;
	public String Document_pro;
	public String Internet_bro;
	public String Video_gen;
	public String App_gen;

	public PortableNotebook() {
		this.CURRENT_MODE = NOTEBOOK_MODE;
		if (CURRENT_MODE == 1) {
			System.out.println("현재 모드: NOTEBOOK_MODE");
		} else if (CURRENT_MODE == 0) {
			System.out.println("현재 모드: TABLET_MODE");
		}

	}

	public PortableNotebook(String Document_pro, String Internet_bro, String Video_gen, String App_gen) {

		this.Document_pro = Document_pro;
		this.Internet_bro = Internet_bro;
		this.Video_gen = Video_gen;
		this.App_gen = App_gen;
	}

	@Override
	public void watchVideo() {
		System.out.println(Video_gen + "시청");

	}

	@Override
	public void useApp() {

		if (CURRENT_MODE == TABLET_MODE) {
			this.CURRENT_MODE = NOTEBOOK_MODE;
			System.out.println("앱 출력");
		} else
			System.out.println("TABLET_MODE");
			System.out.println( App_gen+"앱 출력");

	}

	@Override
	public void writeDocumentaion() {

		System.out.println(Document_pro + "으로 프로그램 작성");

	}

	@Override
	public void searchInternet() {
		System.out.println(Internet_bro + "으로 검색");

	}

	public void changeMode() {
		if (CURRENT_MODE == TABLET_MODE) {
			this.CURRENT_MODE = NOTEBOOK_MODE;
			System.out.println("MODE : NOTEBOOK_MODE ");
		} else if (CURRENT_MODE == NOTEBOOK_MODE) {
			this.CURRENT_MODE = TABLET_MODE;
			System.out.println("MODE : TABLET_MODE ");
		}
	}

}
