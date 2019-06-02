package FileUtils;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

	/*
	 * Checks if a string is empty or null
	 * 
	 * */
	public static boolean isEmpty(String word) {
		return word == null || word.isEmpty();
		
	}
	
	/**
	 * Removes last letter of a word by n amount
	 * else return null
	 * **/
	public static String trimLast(String word, int num) {
		String newStr = word;
		if(!isEmpty(word) && word.length() >= num) {
		
			newStr = newStr.substring(0, word.length() - num);
		}
		
		return newStr;
	}
	
	
	public static boolean contains(String[] arr ,String word ) {
		
		boolean isContains = false;
		for(String ar : arr) {
		
			if(word.contains(ar)) {
				
				isContains = true;
				break;
			}
		}
		
		return isContains;
		
	}
	
	public static List<String> removeWordFromList (List<String> listString, String word){
		List<String> newList = new ArrayList<String>();
		
		for(String str : listString) {
			if(!str.equalsIgnoreCase(word)) {
				newList.add(str);
			}
		}
		
		return newList;
		
	}
	
	
}
