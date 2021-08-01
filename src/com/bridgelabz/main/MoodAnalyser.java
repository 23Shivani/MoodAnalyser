package com.bridgelabz.main;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}
	

	public MoodAnalyser() {
	}


	public String analyseMood() throws MoodAnalyserException {

		try {
			if (message.equals(null)) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionTypes.NULL_POINTER_EXCEPTION);
			} else if (message.isEmpty()) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionTypes.EMPTY_STRING_EXCEPTION);
			}
			if (message.contains("SAD")) {
				return "SAD";
			}
				return "HAPPY";
		} 
		catch (Exception e) {
			e.printStackTrace();
			return "HAPPY";
		}

	}

}
