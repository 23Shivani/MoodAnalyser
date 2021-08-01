package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.bridgelabz.main.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void givenMood_IfHappy_Pass() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("HAPPY");
		// assertTrue( true );
		Assert.assertEquals("HAPPY", mood);	
		}
	@Test
	public void givenMood_IfSAD_Pass() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("SAD");
		// assertTrue( true );
		Assert.assertEquals("SAD", mood);	
		}
}
