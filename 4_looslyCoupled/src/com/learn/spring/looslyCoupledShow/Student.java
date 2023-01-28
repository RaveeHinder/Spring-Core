package com.learn.spring.looslyCoupledShow;

public class Student {

	private static int id=001;
	
	//Tightly coupled
	private Cheat cheat;
	
//	private ScienceCheat scienceCheat;  This requires loosly coupled

	// Setter injections
	public void setId(int id) {
		this.id = id;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void studentInfo() {
		System.out.println("Student id is " + this.id++);
		this.cheat.cheat();

	}

}
