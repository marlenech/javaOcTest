package com.java.abclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loup animal = new Loup("Gris", 20);
		animal.boire();
		animal.manger();
		animal.deplacement();
		animal.crier();
		System.out.println(animal.toString());

	}

}
