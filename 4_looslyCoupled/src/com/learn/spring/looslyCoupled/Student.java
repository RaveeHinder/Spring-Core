package com.learn.spring.looslyCoupled;

public class Student {

	private static int id=001;
	
	//Tightly coupled
	private MathCheat mathCheat;
	
//	private ScienceCheat scienceCheat;  This requires loosly coupled

	// Setter injections
	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void studentInfo() {
		System.out.println("Student id is " + this.id++);
		this.mathCheat.cheat();

	}

}
