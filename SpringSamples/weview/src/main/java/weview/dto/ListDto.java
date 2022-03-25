package weview.dto;

import java.io.Serializable;

/*
 CREATE TABLE MOVIE(
    SEQ_MOVIE	NUMBER(3,0) PRIMARY KEY,
    TITLE	VARCHAR2(100 BYTE) NOT NULL,
    GENRE	VARCHAR2(20 BYTE) NOT NULL,
    DIRECTOR	VARCHAR2(50 BYTE) NOT NULL,
    COUNTRY	VARCHAR2(20 BYTE) NOT NULL,
    ACTOR	VARCHAR2(500 BYTE) NOT NULL,
    CREATED	DATE,
    AGE	NUMBER(2,0) NOT NULL,
    RUNNINGTIME	NUMBER(3,0) NOT NULL,
    STORY	VARCHAR2(2000 BYTE) NOT NULL,
    RATE	NUMBER(2,1) NOT NULL,
    TRAILER	VARCHAR2(50 BYTE),
    POSTER	VARCHAR2(50 BYTE)
);
 
 */
public class ListDto implements Serializable{
	
	private int seq_moive; //영화 번호
	private String title;  //영화 제목
	private String genre; //영화 장르
	private String director; //영화감독
	private String country; //제작 국가
	private String actor; //배우
	private String created; //개봉일
	private int age; //제한연령
	private int runningtime; //상영시간
	private String story; //줄거리
	private int rate; //평점
	private String trailer; //예고편
	private String poster; // 포스터
	
	public ListDto() {}
	
	public int getSeq_moive() {
		return seq_moive;
	}

	public ListDto(int seq_moive, String title, String genre, String director, String country, String actor,
			String created, int age, int runningtime, String story, int rate, String trailer, String poster) {
		super();
		this.seq_moive = seq_moive;
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
	
	
	public void setSeq_moive(int seq_moive) {
		this.seq_moive = seq_moive;
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

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
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
		return "ListDto [seq_moive=" + seq_moive + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", country=" + country + ", actor=" + actor + ", created=" + created + ", age=" + age
				+ ", runningtime=" + runningtime + ", story=" + story + ", rate=" + rate + ", trailer=" + trailer
				+ ", poster=" + poster + "]";
	}

	
	
}
