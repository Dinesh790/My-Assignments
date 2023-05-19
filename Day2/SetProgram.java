package week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Print only unique characters in the given string
String companyName = "google" --> "gole"
Hints: 
Use Set with add method.

 */
		String companyName=  "google";
	   Set<Character>charset=new LinkedHashSet<>(); 
	   for(int i=0;i<companyName.length();i++) {
		   boolean add = charset.add(companyName.charAt(i));
		   if(!add) {
			   charset.add(companyName.charAt(i));
		   }
	   }
	   
		for (Character character : charset) {
			System.out.println(character);
		}
		
	}

}
