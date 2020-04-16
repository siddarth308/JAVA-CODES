package arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparceArrays {

	 static int[] matchingStrings(String[] strings, String[] queries) {
		 Map<String, Integer> map = new HashMap<>();
		 int result[] = new int[queries.length];
		 
		 for(int i=0; i < strings.length; i++) {
			 String inputString = strings[i];
			 if(map.containsKey(inputString)) {
				 map.put(inputString, map.get(inputString) +1);
			 } else {
				 map.put(inputString, 1);
			 }
		 }
		 
		 for(int i=0; i < queries.length; i++) {
			 String queryString = queries[i];
			 if (map.containsKey(queryString)) {
				 result[i] = map.get(queryString);
			 }
		 }
		 
		return result;
	 }

		

	}


