package weview.dto;

public class MainDto {

	private String title;
	private String created;
	private String country;
	private String genre;
	private double rate;
	private String poster;
	private int runningtime;
	private String actor;
	private String story;
	private int seq_movie;
	
	public MainDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainDto(String title, String created, String country, String genre, double rate, String poster,
			int runningtime, String actor, String story, int seq_movie) {
		super();
		this.title = title;
		this.created = created;
		this.country = country;
		this.genre = genre;
		this.rate = rate;
		this.poster = poster;
		this.runningtime = runningtime;
		this.actor = actor;
		this.story = story;
		this.setSeq_movie(seq_movie);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public int getSeq_movie() {
		return seq_movie;
	}

	public void setSeq_movie(int seq_movie) {
		this.seq_movie = seq_movie;
	}

	@Override
	public String toString() {
		return "MainDto [title=" + title + ", created=" + created + ", country=" + country + ", genre=" + genre
				+ ", rate=" + rate + ", poster=" + poster + ", runningtime=" + runningtime + ", actor=" + actor
				+ ", story=" + story + ", seq_movie=" + seq_movie + "]";
	}

	
}
