package ex0612;

public class Music {

	// 필드
	private String title; // 노래제목
	private String singer; // 가수
	private String path; // 노래 저장 경로

	public Music(String title, String singer, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	public Music() {
	}

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
