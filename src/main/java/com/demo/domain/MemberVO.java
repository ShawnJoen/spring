package com.demo.domain;

import java.util.Date;

public class MemberVO {
	private int id;
	private char mobile;
	private char service_tel;
	private String service_name;
	private String name;
	private String logo;
	private String address;
	private int status;
	private Date created_at;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getMobile() {
		return mobile;
	}
	public void setMobile(char mobile) {
		this.mobile = mobile;
	}
	public char getService_tel() {
		return service_tel;
	}
	public void setService_tel(char service_tel) {
		this.service_tel = service_tel;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", mobile=" + mobile + ", service_tel=" + service_tel + ", service_name="
				+ service_name + ", name=" + name + ", logo=" + logo + ", address=" + address + ", status=" + status
				+ ", created_at=" + created_at + "]";
	}
}
