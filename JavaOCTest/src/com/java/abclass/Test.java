package com.java.abclass;

public class Test {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	//Declaration of exception
		throws PoidsException {
		Tigre animal = new Tigre("Jaune", -2);
		
			//action if exception is true
			if (animal.poids < 0)
				throw new PoidsException();
			else {
		animal.boire();
		animal.manger();
		animal.deplacement();
		animal.crier();
		System.out.println(animal.toString());

	}
		}
	
	

}