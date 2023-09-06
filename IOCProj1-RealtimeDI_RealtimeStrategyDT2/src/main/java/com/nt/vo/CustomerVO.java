package com.nt.vo;

public class CustomerVO {
	//bean properties
	private String cusname ;
	private String cusaddrs;
	private String pamt;
	private String time;
	private String rate;
	//setter and getter methods(Alt+shift+ s,r)
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCusaddrs() {
		return cusaddrs;
	}
	public void setCusaddrs(String cusaddrs) {
		this.cusaddrs = cusaddrs;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
}
