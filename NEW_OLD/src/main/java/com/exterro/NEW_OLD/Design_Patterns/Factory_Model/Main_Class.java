//also known as Abstract factory
//arguments passed
//created factory 
package com.exterro.NEW_OLD.Design_Patterns.Factory_Model;

public class Main_Class {
	public static void main(String args[]) {
	 Factory shapeFactory = new Factory();

     //get an object of Circle and call its draw method.
     Shapes shape1 = shapeFactory.getShape("Rectangle");

     //call draw method of Circle
     shape1.draw();

     //get an object of Rectangle and call its draw method.
     Shapes shape2 = shapeFactory.getShape("Interface_Class");

     //call draw method of Rectangle
     shape2.draw();

}}
