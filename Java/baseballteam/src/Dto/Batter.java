package Dto;

public class Batter {
	private double batCount;
	private double hit;
	private double batavg;
	
	
	public Batter(double batCount, double hit, double batavg) {
		super();
		this.batCount = batCount;
		this.hit = hit;
		this.batavg = batavg;
	}


	public double getBatCount() {
		return batCount;
	}


	public void setBatCount(double batCount) {
		this.batCount = batCount;
	}


	public double getHit() {
		return hit;
	}


	public void setHit(double hit) {
		this.hit = hit;
	}


	public double getBatavg() {
		return batavg;
	}


	public void setBatavg(double batavg) {
		this.batavg = batavg;
	}


	@Override
	public String toString() {
		return "Batter [batCount=" + batCount + ", hit=" + hit + ", batavg=" + batavg + "]";
	}
	
	
	
}
