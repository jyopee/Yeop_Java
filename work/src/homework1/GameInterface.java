package homework1;

public class GameInterface {

	public static void main(String[] args) {
		
		Keypad game = new rpgGame();
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game. rightDownButton();
		game.changeMode();
		game.rightDownButton();
		System.out.println("=====================");
		Keypad game1 = new ArcadeGame();
		game1.leftUpButton();
		game1.rightUpButton();
		game1.leftDownButton();
		game1.changeMode();
		game1.rightUpButton();
		game1.leftUpButton();
		game1.rightDownButton();
		
		
		
		
		
		
	
		
		
	}

}
