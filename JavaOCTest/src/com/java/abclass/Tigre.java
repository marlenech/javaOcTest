package com.java.abclass;

/*Create class Lion inherits class Felin
 *Determinate couleur, poids and cri
 */

public class Tigre extends Felin {
	 public Tigre() {
//Default constructor
	 }
	 
	 public Tigre(String couleur, int poids){
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	
	void crier() {
		System.out.println("Je grogne très fort.");
	}

}