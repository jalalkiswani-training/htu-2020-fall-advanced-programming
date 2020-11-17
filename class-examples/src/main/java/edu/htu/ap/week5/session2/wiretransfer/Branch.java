package edu.htu.ap.week5.session2.wiretransfer;

public class Branch {
	private int code;
	private String name;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Branch [code=" + code + ", name=" + name + "]";
	}

}
