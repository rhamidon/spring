package com.riyaz.spring.model;

public class Scores {
	private double maths;
	private double physics;
	private double english;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", english=" + english + "]";
	}

}
