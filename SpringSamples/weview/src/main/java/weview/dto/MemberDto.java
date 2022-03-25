package weview.dto;

import java.io.Serializable;
import java.util.Date;

/*
CREATE TABLE MEMBER(
	SEQ NUMBER(10) PRIMARY KEY,
	ID VARCHAR2(50) UNIQUE,
	PWD VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	EMAIL VARCHAR2(50) UNIQUE,
	NICKNAME VARCHAR2(50) UNIQUE,
	 CREATEDATE DATE,
    PROFILE INTEGER
);


INSERT INTO MEMBER(SEQ, ID, PWD, NAME, EMAIL, NICKNAME)
VALUES(1,'aaa','111','최철','test@gmail.com','테스트');


*/


public class MemberDto implements Serializable{	// = 직렬화
	
	/*
	private int seq;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String nickname;
	private String pwd;
	*/
	
	private int seq_user;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String nickname;
	private Date createdate;
	private String profile;
	private String profile2;
	
	
	public MemberDto() {
	}


	public MemberDto(int seq_user, String id, String pwd, String name, String email, String nickname, Date createdate,
			String profile, String profile2) {
		super();
		this.seq_user = seq_user;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.nickname = nickname;
		this.createdate = createdate;
		this.profile = profile;
		this.profile2 = profile2;
	}


	public int getSeq_user() {
		return seq_user;
	}


	public void setSeq_user(int seq_user) {
		this.seq_user = seq_user;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public Date getCreatedate() {
		return createdate;
	}


	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getProfile2() {
		return profile2;
	}


	public void setProfile2(String profile2) {
		this.profile2 = profile2;
	}


	@Override
	public String toString() {
		return "MemberDto [seq_user=" + seq_user + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email
				+ ", nickname=" + nickname + ", createdate=" + createdate + ", profile=" + profile + ", profile2=" + profile2 + "]";
	}
	
	
}
