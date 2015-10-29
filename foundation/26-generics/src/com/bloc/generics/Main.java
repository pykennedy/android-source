package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		Spoon spoon = new Spoon();
		Toy toySpoon = new Toy<Spoon>(spoon);
		toyBox.addToy(toySpoon);
		
		Book book = new Book();
		Toy toyBook = new Toy<Book>(book);
		toyBox.addToy(toyBook);
		
		ActionFigure actionFigure = new ActionFigure();
		Toy toyActionFigure = new Toy<ActionFigure>(actionFigure);
		toyBox.addToy(toyActionFigure);
		
		Thing thing = new Thing("Ray Charles' sight");
		Toy toyThing = new Toy<Thing>(thing);
		toyBox.addToy(toyThing);
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
