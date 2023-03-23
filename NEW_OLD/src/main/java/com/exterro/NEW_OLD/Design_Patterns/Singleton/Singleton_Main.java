package com.exterro.NEW_OLD.Design_Patterns.Singleton;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Singleton_Main {
	
	static Logger log = LogManager.getLogger(Singleton_Main.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();

    	log.info("The program begins successfully");
    	
	      Singleton_Sample tmp = Singleton_Sample.getInstance();
	      tmp.demoMethod();
	      log.error("this is an error message");
	   }
}
