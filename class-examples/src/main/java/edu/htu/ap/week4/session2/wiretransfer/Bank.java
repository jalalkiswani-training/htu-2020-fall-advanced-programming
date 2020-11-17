package edu.htu.ap.week4.session2.wiretransfer;

public class Bank {
	private int bankCode;
	private String bankName;
	public int getBankCode() {
		return bankCode;
	}
	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + "]";
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
