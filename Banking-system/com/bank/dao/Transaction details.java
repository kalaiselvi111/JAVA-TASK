package com.bank.dao;

public class TransactionDetail {
	private String transactionId;
	private String type;
	private double amount;
	private String date;
	private double balance;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public TransactionDetail(String transactionId, String type, double amount, String date, double balance) {
		super();
		this.transactionId = transactionId;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.balance = balance;
	}
	

}
