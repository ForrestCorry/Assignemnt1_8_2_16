package com.ssa.assignment1day1;


public class AssignmentOne {
	
	public static void main(String[] args) {
		
		String hello = "Hello World";
		int columbus = 1492;
		boolean hasDog = true;
		String todaysDate = "8/2/2016";
		Float money = 5.45f;
		char oneLetter = 'X';
		String[] movies = new String[10];
		
			movies[0] = "Forrest Gump";
			movies[1] = "Milo & Ottis";
			movies[2] = "Friday";
			movies[3] = "Next Friday";
			movies[4] = "Friday After Next";
			movies[5] = "Lord of The Rings";
			movies[6] = "Judge";
			movies[7] = "Fury";
			movies[8] = "Avatar";
			movies[9] = "Straight Outta Compton";
			
			
		
		
		System.out.println(hello);
		
		System.out.println("Columbus Sailed the world in " + columbus + ".");
		
		if(hasDog){
			System.out.println("I have a Dog.");
		}
		
		else{
			System.out.println("i do not have a Dog.");
		}
		
		System.out.println("Today is " + todaysDate + ".");
		
		System.out.println("I spent $" + money + " on a cheeseburger!");
		
		System.out.println(oneLetter + " marks the spot!");
		
		for (int i = 0; i < movies.length ; i++) {
			System.out.println(movies[i]);
		}
		
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				System.out.print("\t" + (i*j) + "");
			}
			System.out.println("");
		}
		
	}
	
	public boolean livesInMaryland(boolean hasDog) {
		return false;
	}
	
	public void cat(){
		System.out.println("I'm a Dog Person");
	}
	
	public int numberOfDays(int todaysDate){
		return todaysDate;
	}
	
	public float debt(){
		return 0;
	}
	
	public long distanceToSun(){
		return 0;
	}
	
	private void baseBall(){
	}
	
	protected String numberOfBatters(){
		return null;
	}
	
	
	
		
	}

	

	
	





