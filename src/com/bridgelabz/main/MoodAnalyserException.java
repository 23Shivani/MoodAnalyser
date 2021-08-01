package com.bridgelabz.main;

public class MoodAnalyserException extends Exception{
	ExceptionTypes message;

	enum ExceptionTypes {
		NULL_POINTER_EXCEPTION, EMPTY_STRING_EXCEPTION, UNDEFINED_MOOD_EXCEPTION;

		public class EMPTY_STRING_EXCEPTION extends Exception {

		}
	}

	public MoodAnalyserException(ExceptionTypes message) {
		super(String.valueOf(message));
		this.message = message;
	}
}
