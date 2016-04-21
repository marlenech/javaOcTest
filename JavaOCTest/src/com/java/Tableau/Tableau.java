package com.java.Tableau;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create table with double dimension
		
		String tableau [] [] = {{"1","3","5","9"},{"0","2","4","6"}};
		
		int [] tab  = {10, 11, 12};
		
		for (int i = 0; i<=tab.length; i++);
		{
		
		// Display all the data tables of "tab"
		System.out.println(java.util.Arrays.toString(tab));
		}
		// Display 3rd data of second table "tableau"		
		System.out.println(tableau [1] [2]);
		
		// Display all the data tables of "tableau"
		
		for (String tab1[] : tableau) {
			for (String str : tab1) 
		{
		System.out.println(str);
		}
			}
		
	}
		
		
		
			}
		
	


