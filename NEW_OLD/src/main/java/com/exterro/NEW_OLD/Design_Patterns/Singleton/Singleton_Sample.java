package com.exterro.NEW_OLD.Design_Patterns.Singleton;


public class Singleton_Sample {
	
	   private static Singleton_Sample singleton = new Singleton_Sample(); 
	   
	   private Singleton_Sample() { }
	   
	   public static Singleton_Sample getInstance() {
		   System.out.println("Hi, i am inside constructor");
	      return singleton;
	   }

	   protected static void demoMethod() {
	      System.out.println("demoMethod for singleton");
	   }


}
