package edu.htu.ap.week4.session2.wiretransfer;

public class Account {
	private int accountNum;
	private String name;
	private AccountType type;
	private Bank bank;
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", name=" + name + ", type=" + type + ", bank=" + bank
				+ ", branch=" + branch + "]";
	}
	private Branch branch;
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
