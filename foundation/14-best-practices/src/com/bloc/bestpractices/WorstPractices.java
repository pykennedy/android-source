package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String[] args) 
	{
		int magicNumber = WorstPractices.animals(false);
		magicNumber *= 5;
		if (magicNumber > 18) 
		{
			while(magicNumber > 0)
			{
				magicNumber--;
			}
		}
	}
	private static int animals(boolean yesWellHeresTheThing)
	{

		// Start off with one of these
		int aInt = yesWellHeresTheThing ? 34 : 21;
		float sparklesFairy = .5f;
		for (int brown = 0; brown < aInt; brown++) 
		{ 
			sparklesFairy *= aInt;
		} 
		return (int) sparklesFairy * aInt;
	}

/* 
 animals
 this method takes in a single parameter, yeswellheresthething. Using 
 a very elaborate and complex algorithm, it calculate a magic number
 yeswellheresthething: a seed which helps generate the magic number
 returns: a magical number
 */


	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
