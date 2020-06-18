package com.assessment.payments.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@Table(name="PAYMENT_HISTORY")
@ApiModel(description = "Details about the Payments")
public class Payment {
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private long id;
	@Column(name="USER_ID")
	private int userId;
	@Column(name="CURRENCY_ID")
	private int currencyId;
	@Column(name="NAME")
	private String name;
	@Column(name="DATE")
	private Date date;
	@Column(name="TRANSACTION_DETAILS")
	private String transactionDetails;
	@Column(name="AMOUNT")
	private float amount;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
