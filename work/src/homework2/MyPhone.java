package homework2;

public class MyPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPhone phone = new MyPhone();
		MyPhone phoneA = new PortableNotebook("한글 2020","Chrome","영화","안드로이드");
		Notebook Note = new PortableNotebook("한글 2020","Chrome","영화","안드로이드");
		Note.writeDocumentaion();
		Tablet tablet = new PortableNotebook("한글 2020","Chrome","영화","안드로이드");
		tablet.watchVideo();
		tablet.useApp();
		Note.searchInternet(); 
		
		
	    

	}

}
