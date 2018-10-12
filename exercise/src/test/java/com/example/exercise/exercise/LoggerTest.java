package com.example.exercise.exercise;

import java.util.Map;

import org.junit.Test;

import com.example.exercise.exercise.bean.JobLogger;
import com.example.exercise.exercise.bean.LoggerConstants;

public class LoggerTest {

	@Test
	public void tes () {
		JobLogger jobLogger = new JobLogger(LoggerConstants.WARNING.getId(), (Map) null);
		try {
			jobLogger.LogMessage("Hola mundo", LoggerConstants.WARNING);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
