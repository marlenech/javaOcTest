package com.java.abclass;

/*Create class Lion inherits class Felin
 *Determinate couleur, poids and cri
 */

public class Lion extends Felin {
	 public Lion() {
//Default constructor
	 }
	 
	 public Lion(String couleur, int poids){
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	
	void crier() {
		System.out.println("Je rugis dans la savane.");
	}

}