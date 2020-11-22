package edu.htu.ap.week6.session1.wiretransfer.again;

public class WireTransfer {
	private Account fromAccount;
	private Account toAccount;
	private double amount;
	private String valueDate;
	private WireTransferStatus status;
	private Currency currency;

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public WireTransferStatus getStatus() {
		return status;
	}

	public void setStatus(WireTransferStatus status) {
		this.status = status;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
