/*********************************************************************************************************
 * File Name: SeleniumGridServer.java
 * Author: Sampad Rout
 * Creation Date: 07-Mar-2018
 *Description: This class starts and stops the Selenium Grid server at the run time.
 * Copyright: Thinkrite Inc.
 *********************************************************************************************************/
//        
package com.amaserenity.utils;

import java.io.IOException;
import java.util.concurrent.Executor;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.ExecuteWatchdog;

public class RegisterNodes {

	static Executor SeleniumGridServerProcess;

	public static void startSeleniumGridServer() throws ExecuteException, IOException, Exception {
		try {
			
			// appium --nodeconfig /Users/sampadrout/Downloads/android_node1.json

			CommandLine command = new CommandLine("appium");
			command.addArgument("--nodeconfig");
			command.addArgument(System.getProperty("user.dir") + "/SeleniumGrid/android_node1.json");

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
}