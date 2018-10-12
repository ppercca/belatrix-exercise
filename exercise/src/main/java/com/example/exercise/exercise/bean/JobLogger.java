package com.example.exercise.exercise.bean;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.StringJoiner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JobLogger {
	private int logType;
	private boolean initialized;
	private static Map dbParams;
	private static Logger logger;
	
	JobLogger jobLogger;
	
	public JobLogger(int logType, Map dbParams) {
		this.logType = logType;
		this.dbParams = dbParams;
		this.logger = Logger.getLogger("MyLog");
	}
	
	public static void LogMessage(String messageText, LoggerConstants loggerType) throws Exception {
		messageText.trim();
		StringJoiner stringJoiner = new StringJoiner(" - ");
		stringJoiner.add(loggerType.getType());
		stringJoiner.add(DateFormat.getDateInstance(DateFormat.LONG).format(new Date()));
		stringJoiner.add(messageText);
		messageText = stringJoiner.toString();
		System.out.println("messageText --> " + messageText);
		
//		Connection connection = null;
//		Properties connectionProps = new Properties();
//		connectionProps.put("user", dbParams.get("userName"));
//		connectionProps.put("password", dbParams.get("password"));
//		connection = DriverManager.getConnection("jdbc:" + dbParams.get("dbms") + "://" + dbParams.get("serverName")
//		+ ":" + dbParams.get("portNumber") + "/", connectionProps);
//		Statement stmt = connection.createStatement();
//		stmt.executeUpdate("insert into Log_Values('" + message + "', " + String.valueOf(t) + ")");
//		
//		
//		File logFile = new File(dbParams.get("logFileFolder") + "/logFile.txt");
//		if (!logFile.exists()) {
//			logFile.createNewFile();
//		}		
//		FileHandler fh = new FileHandler(dbParams.get("logFileFolder") + "/logFile.txt");
//		logger.addHandler(fh);
//		logger.log(Level.INFO, messageText);
//		
//		
//		ConsoleHandler ch = new ConsoleHandler();
//		logger.log(Level.INFO, messageText);
		
	}
	
}
