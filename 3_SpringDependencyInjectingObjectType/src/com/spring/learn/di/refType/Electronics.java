package com.spring.learn.di.refType;

public class Electronics {

	private static int serialNo=1011;
	private Electricity electricity;

	public String checkElectricity() {
		return this.electricity.current() + " It's serial number is "+this.serialNo++;
	}
	
	// Setter injections
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public void setElectricity(Electricity electricity) {
		this.electricity = electricity;
	}


}
