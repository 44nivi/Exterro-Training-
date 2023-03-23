package com.exterro.NEW_OLD.Design_Patterns.Builder_Pattern;

public class Builder_Factory {

	 public Meals prepareVegMeal (){
	      Meals meal = new Meals();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meals prepareNonVegMeal (){
	      Meals meal = new Meals();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
}
