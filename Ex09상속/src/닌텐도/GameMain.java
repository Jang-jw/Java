package 닌텐도;

public class GameMain {

	public static void main(String[] args) {

		// 닌텐도 게임기 그 자체!!
		// 실제 게임시 실행되는 곳!

		// 게임 칩과 게임기를 연결 할 수 있는 메소드 생성!
		// -> insert()

		// 포켓몬고 게임 칩 생성
		Pokemon poke = new Pokemon();
		// 게임을 진행 할 수 있는 insert() 메소드에
		// 게임 칩 연결!
		insert(poke);
		insertgo(poke);

		// 마리오
		Mario mario = new Mario();
		insert(mario);
		insertgo(mario);

		// 애니멀
		Animal ani = new Animal();
		insert(ani);
		insertgo(ani);

	}

	// insert() 하나만 만들어 놓고
	// 다양한 타입의 게임칩이 들어오도록 수정!
	public static void insert(Game game) {
		game.start();
	}

	public static void insertgo(Game game) {
		game.startgo();
	}

//	public static void insert(Mario mario) {
//		mario.start();
//	}

}
