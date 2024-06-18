package com.eoi.es.dto;

import java.util.Date;

public class Order {

	private String code;
	private String user;
	private Date date;
	private Double total;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [code=" + code + ", user=" + user + ", date=" + date + ", total=" + total + "]";
	}
	
	

}
