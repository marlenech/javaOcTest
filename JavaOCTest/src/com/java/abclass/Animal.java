package com.java.abclass;

//Create class abstract Animal with method manger boire deplacement crier

 abstract class Animal{
	 

	protected String couleur;
	protected int poids;
	
	protected void manger(){
		System.out.println("Je mange de la viande.");
	}
	
	protected void boire(){
		System.out.println("Je bois de l'eau !");
	}
	
	abstract void deplacement();
	
	abstract void crier();
	
	String className = this.getClass().getName();
	
	public String toString(){
		//getClass is a method of class Object. Result is class <name of class>
		String str = "Je suis un objet de la " + className +", je suis " + this.couleur + ",je pèse "+ this.poids; return str;
	
		
	}
}
 
