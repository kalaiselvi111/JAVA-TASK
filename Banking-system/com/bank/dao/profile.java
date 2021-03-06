package com.bank.dao;

import java.util.List;
import java.util.Map;

public class Profile {
	protected long accountNumber;
	private String name,dob,phoneNumber,email,proofId,gender,accounType;
	protected double  balance;
	private Map<String,Address> address;
	private Transaction login;
	private List<TransactionDetail> transaction;
	public Profile(long accountNumber, String name, String dob, String phoneNumber, String email, String proofId,
			String gender, String accounType, double balance, Map<String, Address> address, Transaction login,
			List<TransactionDetail> transaction) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.proofId = proofId;
		this.gender = gender;
		this.accounType = accounType;
		this.balance = balance;
		this.address = address;
		this.login = login;
		this.transaction = transaction;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	
	public void addAddress(String type,Address address){
		this.address.put(type, address);
	}
	public void removeAddress(String type,Address address){
		this.address.put(type,null);
		
	}
	public Transaction getLoginInfo(){
		return login;
	}
	public List<TransactionDetail>getTransactionInfo(){
		return transaction;
	}
	public void withdraw(double amount){
		this.balance = this.balance + amount;
	}
	public void deposit(double amount){
		this.balance = this.balance - amount;
	}
	

}
