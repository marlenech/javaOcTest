package com.java.abclass;

/*Create class Loup inherits class Canin
 *Determinate couleur, poids and cri
 */

public class Loup extends Canin {
	 public Loup() {
//Default constructor
	 }
	 
	 public Loup(String couleur, int poids){
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	
	void crier() {
		System.out.println("Je hurle à la Lune.");
	}

}