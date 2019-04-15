package com.jaey.spring;

public class ListEntity {
	String pic;
	String name;
	String phone;
	String loc;
	String etc;
	
	public ListEntity (String pic, String name, String phone, String loc, String etc) {
		this.pic = pic;
		this.name = name;
		this.phone = phone;
		this.loc = loc;
		this.etc = etc;
	}
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
}
