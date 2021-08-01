package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.main.MoodAnalyser;
import com.bridgelabz.main.MoodAnalyserException;

public class MoodAnalyserTest {
	@Test
	public void givenMood_IfHappy_Happy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		// assertTrue( true );
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMood_IfSAD_SAD() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMood_IfNull_InvalidMood() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMood_Empty_InvalidMood() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}
