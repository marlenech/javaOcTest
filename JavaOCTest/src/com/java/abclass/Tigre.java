package com.java.abclass;

/*Create class Tigre inherits class Felin
 *Determinate couleur, poids and cri
 */

public class Tigre extends Felin {
	 public Tigre() {
//Default constructor
	 }
	 
	 public Tigre(String couleur, int poids) 
	//Declaration of exception
				throws PoidsException {
				
				
					//action if exception is true
					if (poids < 0)
						throw new PoidsException();
					else {
			 
		 this.couleur = couleur;
		 this.poids = poids;
	 }
	 }
	
	void crier() {
		System.out.println("Je grogne très fort.");
	}

}