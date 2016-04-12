package com.java.abclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Tigre animal= null;
		try {
			animal = new Tigre("Jaune", -2);
		
		} catch (PoidsException e) {}
		//if exception, the program continues anyway
		finally {
			
			if(animal==null)
				animal = new Tigre();
		}
		animal.boire();
		animal.manger();
		animal.deplacement();
		animal.crier();
		
		
		System.out.println(animal.toString());
		
	}
		}
	
	

