package weview.dto;

import java.io.Serializable;

public class ListParam implements Serializable{
	
	private String colsit;
	
	private String rolist;
	
	private String alist;
	
	private String sflist;
	
	private String flist;
	
	private String tlist;

	public ListParam() {};
	

	public ListParam(String colsit, String rolist, String alist, String sflist, String flist, String tlist) {
		super();
		this.colsit = colsit;
		this.rolist = rolist;
		this.alist = alist;
		this.sflist = sflist;
		this.flist = flist;
		this.tlist = tlist;
	}
	
	

	public String getColsit() {
		return colsit;
	}



	public void setColsit(String colsit) {
		this.colsit = colsit;
	}



	public String getRolist() {
		return rolist;
	}



	public void setRolist(String rolist) {
		this.rolist = rolist;
	}



	public String getAlist() {
		return alist;
	}



	public void setAlist(String alist) {
		this.alist = alist;
	}



	public String getSflist() {
		return sflist;
	}



	public void setSflist(String sflist) {
		this.sflist = sflist;
	}



	public String getFlist() {
		return flist;
	}



	public void setFlist(String flist) {
		this.flist = flist;
	}



	public String getTlist() {
		return tlist;
	}



	public void setTlist(String tlist) {
		this.tlist = tlist;
	}


	@Override
	public String toString() {
		return "ListParam [colsit=" + colsit + ", rolist=" + rolist + ", alist=" + alist + ", sflist=" + sflist
				+ ", flist=" + flist + ", tlist=" + tlist + "]";
	}


}
