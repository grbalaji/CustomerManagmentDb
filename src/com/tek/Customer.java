package com.tek;

public class Customer {
	
	int cNo;
	String cName;
	String cType;
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", cName=" + cName + ", cType=" + cType + "]";
	}
	
	

}
