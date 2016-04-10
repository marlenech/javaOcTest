package com.java.abclass;

/*Create class Chat inherits class Felin
 *Determinate couleur, poids and cri
 */

public class Chat extends Felin {
	 public Chat() {
//Default constructor
	 }
	 
	 public Chat(String couleur, int poids){
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	
	void crier() {
		System.out.println("Je grogne très fort.");
	}

}
