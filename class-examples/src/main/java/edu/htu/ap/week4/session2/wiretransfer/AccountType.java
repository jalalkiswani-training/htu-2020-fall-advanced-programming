package edu.htu.ap.week4.session2.wiretransfer;

public class AccountType {
	private int typeCode;
	private String typeName;
	public int getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "AccountType [typeCode=" + typeCode + ", typeName=" + typeName + "]";
	}
	

}
