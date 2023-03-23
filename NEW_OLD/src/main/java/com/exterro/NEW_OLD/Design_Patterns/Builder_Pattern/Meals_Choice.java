package com.exterro.NEW_OLD.Design_Patterns.Builder_Pattern;

public class Meals_Choice {

}

class Pepsi extends ColdDrink {

	   @Override
	   public float price() {
	      return 35.0f;
	   }

	   @Override
	   public String name() {
	      return "Pepsi";
	   }
	}

 class Coke extends ColdDrink {

	   @Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
	}
 
 class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
	}
 
 class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
	}
 
 class ColdDrink implements Item {

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

 }
 
 class Burger implements Item {

	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	public Packing packing() {
		// TODO Auto-generated method stub
		return null;
	}

	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	}
 
 	class Wrapper implements Packing {

	   @Override
	   public String pack() {
	      return "Wrapper";
	   }
	}
 	
 	
 	class Bottle implements Packing {

 	   @Override
 	   public String pack() {
 	      return "Bottle";
 	   }
 	}
 	
 	