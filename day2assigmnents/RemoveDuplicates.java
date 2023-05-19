package week3.day2assigmnents;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * //		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
 */
		String string = "PayPal India";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for (char c : chars) {
		    charSet.add(c);
		    
		}
		System.out.println(charSet);
		Set<Character> dupCharSet = new LinkedHashSet<Character>(charSet);
		System.out.println(dupCharSet);
		
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			
		    sb.append(character);
		}
		System.out.println("Remove the duplicate value: "+sb.toString());
	}

}
