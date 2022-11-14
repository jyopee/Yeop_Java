package homework1;

public class ArcadeGame implements Keypad {

	public int CURRENT_MODE = 0;

	public void rpgGame() {

		this.CURRENT_MODE = NORMAL_MODE;
		System.out.println("RPG_game 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동합니다.");

	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒷쪽으로 이동합니다.");

	}

	@Override
	public void rightUpButton() {
		if (CURRENT_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격을 합니다.");
		} else if (CURRENT_MODE == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격을 합니다..");
		}

	}

	@Override
	public void rightDownButton() {
		if (CURRENT_MODE == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}else if (CURRENT_MODE == HARD_MODE) {
			System.out.println("캐릭터가 DOUBLE_HIT 공격.");
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