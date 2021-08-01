package com.bridgelabz.main;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}
	

	public MoodAnalyser() {
	}


	public String analyseMood(String message) {

		try {
			if (message.contains("SAD"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		

	}

}
