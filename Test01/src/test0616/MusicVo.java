package test0616;

public class MusicVo {

	protected String title; // 노래 제목
	private String singer; // 가수 이름
	private int playTime; // 노래 길이 ( 초단위 )

	MusicController mc = new MusicController();

	MusicVo mv1 = new MusicVo();
	MusicVo mv2 = new MusicVo();
	MusicVo mv3 = new MusicVo();
	MusicVo mvAll = new MusicVo();

	public void listUP() {
		mc.listTitle.add(mv1);
		mc.listSinger.add(mv2);
		mc.listTime.add(mv3);
	}

	public void listUPAll() {
		mc.musicList.add(mvAll);
	}

	// 기본 생성자
	public MusicVo() {
		super();
	}

	// 생성자
	public MusicVo(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	// toString()
	public String toString() {
		String result = "";
		result = title + "\t" + singer + "\t" + playTime;
		return result;
	}

	// get, set
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
}
