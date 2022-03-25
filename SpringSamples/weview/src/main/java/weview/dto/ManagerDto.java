package weview.dto;

public class ManagerDto {
	
	private int seq_movie;
	private String title;
	private String genre;
	private String director;
	private String country;
	private String actor;
	private String created;
	private String age;
	private String runningtime;
	private String story;
	private String trailer;
	private String poster;
	private String poster2;
	private Double rate;
	
	public ManagerDto() {	
	}

	public ManagerDto(int seq_movie, String title, String genre, String director, String country, String actor,
			String created, String age, String runningtime, String story, String trailer, String poster, String poster2,
			Double rate) {
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
		this.trailer = trailer;
		this.poster = poster;
		this.poster2 = poster2;
		this.rate = rate;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRunningtime() {
		return runningtime;
	}

	public void setRunningtime(String runningtime) {
		this.runningtime = runningtime;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
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

	public String getPoster2() {
		return poster2;
	}

	public void setPoster2(String poster2) {
		this.poster2 = poster2;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "ManagerDto [seq_movie=" + seq_movie + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", country=" + country + ", actor=" + actor + ", created=" + created + ", age=" + age + ", runningtime="
				+ runningtime + ", story=" + story + ", trailer=" + trailer + ", poster=" + poster + ", poster2="
				+ poster2 + ", rate=" + rate + "]";
	}
	
		
	
	
	
	
}
