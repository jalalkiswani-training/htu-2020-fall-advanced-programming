package edu.htu.ap.week5.session2.wiretransfer;

public class WireTransfer {
	private  Account fromAccount;
	private Account toAccount;
	private Currency currency;
	private int amount;
	private String valueDate;
	enum Status{
		NEW,APPROVED,SENT,COMPLETED,REJECTED
	}
	private Status status;
	public Status getSt() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "WireTransfer: \n [fromAccount=" + fromAccount + 
				"\n, toAccount=" + toAccount + ","
						+ "\n currency=" + currency
				+ "\n, amount=" + amount + ",\n valueDate=" + valueDate + ",\n status=" + status + "]";
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Account getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Account getToAccount() {
		return toAccount;
	}
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
