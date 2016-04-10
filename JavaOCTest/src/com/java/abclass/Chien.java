package com.java.abclass;

/*Create class Chien inherits class Canin
 *Determinate couleur, poids and cri
 */

public class Chien extends Canin {
	 public Chien() {
//Default constructor
	 }
	 
	 public Chien(String couleur, int poids){
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	
	void crier() {
		System.out.println("J'aboie sans raison");
	}

}
