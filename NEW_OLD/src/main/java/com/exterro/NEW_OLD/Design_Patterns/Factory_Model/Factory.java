package com.exterro.NEW_OLD.Design_Patterns.Factory_Model;

import java.awt.Shape;

public class Factory {

	public Shapes getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	         
	      else if(shapeType.equalsIgnoreCase("Rectangle")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("Interface_Class")){
	         return new Interface_Class();
	      }
	      
	      return null;
	   }
}
