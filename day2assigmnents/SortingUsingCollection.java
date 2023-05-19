package week3.day2assigmnents;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * // Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems

 */
		String[] stringArray = new String[]{"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int len = stringArray.length;
		System.out.println(len);
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		for(int j =stringArray.length-1; j>=0;j--) {
			System.out.println(stringArray[j] );
	}
	}

}