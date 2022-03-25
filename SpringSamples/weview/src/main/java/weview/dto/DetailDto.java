package weview.dto;

public class DetailDto {

	private int seq_movie;
	private String title;
	private String genre;
	private String director;
	private String country;
	private String actor;
	private String created;
	private int age;
	private int runningtime;
	private String story;
	private double rate;
	private String trailer;
	private String poster;

	public DetailDto() {
		// TODO Auto-generated constructor stub
	}

	public DetailDto(int seq_movie, String title, String genre, String director, String country, String actor,
			String created, int age, int runningtime, String story, double rate, String trailer, String poster) {
		super();
		this.seq_movie = seq_movie;
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.country = country;
		this.actor = actor;
		this.created = created;
		this.age = age;
		this.runningtime = runningtime;
		this.story = story;
		this.rate = rate;
		this.trailer = trailer;
		this.poster = poster;
	}

	public int getSeq_movie() {
		return seq_movie;
	}

	public void setSeq_movie(int seq_movie) {
		this.seq_movie = seq_movie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(int runningtime) {
		this.runningtime = runningtime;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	@Override
	public String toString() {
		return "DetailDto [seq_movie=" + seq_movie + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", country=" + country + ", actor=" + actor + ", created=" + created + ", age=" + age
				+ ", runningtime=" + runningtime + ", story=" + story + ", rate=" + rate + ", trailer=" + trailer
				+ ", poster=" + poster + "]";
	}
	
}
