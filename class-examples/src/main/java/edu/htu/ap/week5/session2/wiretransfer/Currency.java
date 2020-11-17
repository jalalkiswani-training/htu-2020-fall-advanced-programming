package edu.htu.ap.week5.session2.wiretransfer;

public class Currency {
	private String shortCode;
	private String description;
	private double rate;
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Currency [shortCode=" + shortCode + ", description=" + description + ", rate=" + rate + "]";
	}

}
