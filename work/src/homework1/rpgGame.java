package homework1;

public class rpgGame implements Keypad {

	public int CURRENT_MODE = 0;
	

	public void rpgGame() {
		
		this.CURRENT_MODE = NORMAL_MODE;
		System.out.println("RPG_game 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");

	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");

	}

	@Override
	public void rightUpButton() {
	
		if (CURRENT_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if (CURRENT_MODE == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}

	}

	@Override
	public void rightDownButton() {
		if (CURRENT_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		}else if (CURRENT_MODE == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if(CURRENT_MODE == NORMAL_MODE) {
			this.CURRENT_MODE=HARD_MODE;
			System.out.println("현재 모드 : 하드 모드");
		}else if(CURRENT_MODE == HARD_MODE) {
			this.CURRENT_MODE = NORMAL_MODE;
			System.out.println("현재 모드 : 노말 모드");
		}
		
		

	}

}
