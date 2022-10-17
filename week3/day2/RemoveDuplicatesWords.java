package week3.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		Set<String> uniqueText = new LinkedHashSet<String>();

		String text = "We learn java basics as part of java sessions in java week1";

		String[] arrOfStr = text.split(" ");
			
		/*
		 * for (int i = 0; i < arrOfStr.length; i++) { System.out.println(arrOfStr[i]);
		 * uniqueText.add(arrOfStr[i]); }
		 */

		for (String eachString : arrOfStr) {
			uniqueText.add(eachString);
			//System.out.println(eachString);
		}
		
		System.out.println(uniqueText);
		
		Iterator itr = uniqueText.iterator(); 
		
		while (itr.hasNext()) { 
            System.out.print(itr.next()+" "); 
        } 
		
	}

}
