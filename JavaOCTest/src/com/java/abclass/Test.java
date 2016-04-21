package com.java.abclass;

import java.util.ArrayList;
import java.util.List;

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
		
		//Create new collection for testing "genericité"
		
		System.out.println("List de String");
		System.out.println("______________");
		List<String> listeString=new ArrayList<String>();
		listeString.add("une chaîne");
		listeString.add("une autre");
		listeString.add("puis une autre");
		listeString.add("puis une dernière");
		
		for(String str : listeString)
			System.out.println(str);
		
		System.out.println("List de Float");
		System.out.println("______________");
		List<Float> listeFloat=new ArrayList<Float>();
		listeFloat.add(12.25f);
		listeFloat.add(13.78f);
		listeFloat.add(1.67f);
		listeFloat.add(124567.89f);
		
		for(Float f : listeFloat)
			System.out.println(f);
		
		
		
	}
		}
	
	

