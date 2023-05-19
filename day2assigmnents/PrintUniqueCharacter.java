package week3.day2assigmnents;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * //PrintUniqueCharacter
	/*
	 * Problem
	 * 
	 * a) Take your name as input
	 * b) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array
	 * b) Create a new Set -> HashSet
	 * c) Add each character to the Set and if it is already there, remove it
	 * d) Finally, print the set
	 * 
	 */
	    String str = "babu";
		 
	    for (int i = 0; i < str.length(); i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < str.length(); j++)
	        {
	            // checking if two characters are equal
	            if (str.charAt(i) == str.charAt(j) && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0)
	            System.out.print(str.charAt(i));
	    }
	}
	}


