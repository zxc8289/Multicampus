package weview.dto;

import java.util.Date;

public class ReqDto {

	private int seq_user;
	private int seq_request;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String nickname;
	private Date createdate;			//	id생성일자
	private int profile;
	private String title;
	private String content;
	private String created;					// 게시글 생성일자
	
	
	public ReqDto() {
		// TODO Auto-generated constructor stub
	}


	public ReqDto(int seq_user, int seq_request, String id, String pwd, String name, String email, String nickname,
			Date createdate, int profile, String title, String content, String created) {
		super();
		this.seq_user = seq_user;
		this.seq_request = seq_request;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.nickname = nickname;
		this.createdate = createdate;
		this.profile = profile;
		this.title = title;
		this.content = content;
		this.created = created;
	}


	public int getSeq_user() {
		return seq_user;
	}


	public void setSeq_user(int seq_user) {
		this.seq_user = seq_user;
	}


	public int getSeq_request() {
		return seq_request;
	}


	public void setSeq_request(int seq_request) {
		this.seq_request = seq_request;
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


	public int getProfile() {
		return profile;
	}


	public void setProfile(int profile) {
		this.profile = profile;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getCreated() {
		return created;
	}


	public void setCreated(String created) {
		this.created = created;
	}


	@Override
	public String toString() {
		return "ReqDto [seq_user=" + seq_user + ", seq_request=" + seq_request + ", id=" + id + ", pwd=" + pwd
				+ ", name=" + name + ", email=" + email + ", nickname=" + nickname + ", createdate=" + createdate
				+ ", profile=" + profile + ", title=" + title + ", content=" + content + ", created=" + created + "]";
	}

	
		

}
