package com.nt.bo;

public class CustomerBO {
	//bean properties
	private String cusname ;
	private String cusaddrs;
	private Float pamt;
	private Float time;
	private Float rate;
	private Float intrestamt;
	//setter and getter methods(alt+shift+ s,r)
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
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getIntrestamt() {
		return intrestamt;
	}
	public void setIntrestamt(Float intrestamt) {
		this.intrestamt = intrestamt;
	}
//toString(alt+shift+s,s)
	@Override
	public String toString() {
		return "CustomerBO [cusname=" + cusname + ", cusaddrs=" + cusaddrs + ", pamt=" + pamt + ", time=" + time
				+ ", rate=" + rate + ", intrestamt=" + intrestamt + "]";
	}
	
}
