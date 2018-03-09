/*********************************************************************************************************
* File Name: SeleniumGridServer.java
* Author: Sampad Rout
* Creation Date: 07-Mar-2018
*Description: This class starts and stops the Selenium Grid server at the run time.
* Copyright: Thinkrite Inc.
*********************************************************************************************************/

package com.amaserenity.utils;

import java.io.IOException;
import java.util.concurrent.Executor;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;
public class SeleniumGridServer {
	
	static Executor SeleniumGridServerProcess;

	public static void startSeleniumGridServer() throws ExecuteException, IOException, Exception {
		try {
			
			// java -jar /Users/sampadrout/Downloads/selenium-server-standalone-3.10.0.jar -role hub http://127.0.0.1:4444/grid/console
			CommandLine command = new CommandLine("java");
			command.addArgument("-jar");
			command.addArgument(System.getProperty("user.dir") + "/SeleniumGrid/selenium-server-standalone-3.10.0.jar");
			command.addArgument("-role");
			command.addArgument("hub");
			command.addArgument("http://127.0.0.1:4444/grid/console");

			DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
			ExecuteWatchdog watchdog = new ExecuteWatchdog(ExecuteWatchdog.INFINITE_TIMEOUT);
			DefaultExecutor SeleniumGridServerProcess = new DefaultExecutor();
			SeleniumGridServerProcess.setExitValue(1);
			SeleniumGridServerProcess.setWatchdog(watchdog);
			System.out.println("Selenium Grid Server starting now " + command);
			SeleniumGridServerProcess.execute(command, resultHandler);
		} catch (Exception e) {
			System.out.println("Excption is " + e);
		}
	}

	public static void stopSeleniumGridServer() throws IOException {
			
		CommandLine command = new CommandLine("killall");
		command.addArgument("node");

		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		System.out.println("Selenium Grid Server stop command is executing now " + command);
		executor.execute(command, resultHandler);

		System.out.println("Selenium Grid Server stopped successfully");

	}
}