//having two interface *item and *packing is implemented by other class 
//builder pattern consist of main class 
// builder factory
//


package com.exterro.NEW_OLD.Design_Patterns.Builder_Pattern;

public class Builder_Main {

	 public static void main(String[] args) {
		   
	      Builder_Factory mealBuilder = new Builder_Factory();

	      Meals vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meals nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	   }
}
