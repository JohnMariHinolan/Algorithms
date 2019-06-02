package wordfunnel;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import FileUtils.FileUtil;
import FileUtils.StringUtil;

public class WordFunnelMain {

	/**
	 * A word funnel is a series of words formed by removing one letter at a time from a starting word, keeping the remaining letters in order. For the purpose of this challenge, a word is defined as an entry in the enable1 word list. An example of a word funnel is:

        gnash => gash => ash => ah
       This word funnel has length 4, because there are 4 words in it.

       Given a word, determine the length of the longest word funnel that it starts. You may optionally also return the funnel itself (or any funnel tied for the longest, in the case of a tie).
	 * 
	 * ***/
	private static final String FILEPATH = "C:\\Users\\JM\\eclipse-playground\\dailyprogrammer\\src\\main\\resources\\wordFile.txt";
	
	public static void main (String[] args) {
		
	
		
				// Readthe wordFile.txt
		File file =FileUtil.readFile(FILEPATH);
		String[] arr =FileUtil.readFileContent(file);
		//print(arr);
		String inputWord = "gnash";
	
		List<String> arrayStr = Arrays.asList(arr);
	//	printWordFunnel(arrayStr,inputWord,funnelCounter);
		WordTrail wordT = getWordTrail(arrayStr,inputWord);
		System.out.println("Count: " + wordT.getCount());
		print(wordT.getWordTrail());
	}
	

	
	/***
	 * 
	 * 
	 * 
	 * **/
	private static WordTrail getWordTrail(List<String> arr, String inputWord){
		//System.out.println("New Word: " + inputWord);
		List<String> newArr = new ArrayList<String>();
		if(!StringUtil.isEmpty(inputWord)) {	
		
			for(String ar : arr) {	
				if(inputWord.contains(ar) && !inputWord.equalsIgnoreCase(ar)) {	
				
					newArr.add(ar);	
				}
			}
	
		}	
		
		
		WordTrail selectedWordTrail = new WordTrail(inputWord);
		for(String str : newArr) {
			WordTrail currSelectedWordTrail = getWordTrailObj( newArr, str);
		
			System.out.println("New Word: " + currSelectedWordTrail.getWordTrail());
			if(selectedWordTrail == null || currSelectedWordTrail.getCount() > selectedWordTrail.getCount()) {
				
				selectedWordTrail.addWordTrail(currSelectedWordTrail);
			}
			
		}
		
		
		return selectedWordTrail;
	}
	

	private static WordTrail getWordTrailObj(List<String> arr, String inputWord) {
		
		WordTrail wordTrail =  new WordTrail(inputWord);
		
		for(String str : arr) {
			if(inputWord.contains(str) && !inputWord.equalsIgnoreCase(str)) {					
				wordTrail.addWordTrail(getWordTrailObj(StringUtil.removeWordFromList(arr, str),str));	
			   break;
			}
			
		}
		return wordTrail;
	}
	
	
	private static void print(String[] arr ) {
		
		for(String ar : arr ) {
			System.out.println(ar);
		}
		
	}
	
private static void print(List<String> arr ) {
		
		for(String ar : arr ) {
			System.out.println(ar);
		}
		
	}

	
	static class WordTrail {
		private List<String> wordTrail = new ArrayList<String>();
		private  final String word;
		public WordTrail(String word) {
		 this.word = word;
		 addWord( word);
		}
		
		public void addWord(String word) {
			wordTrail.add(word);
		}
		
		
		public List<String> getWordTrail() {
			return wordTrail;
		}

		public int getCount() {
			return wordTrail.size();
		}
		
		public String getWord() {
			return  this.word;
		}
		
		public void addWordTrail(WordTrail wordTrail) {
			 List<String> childWord =  wordTrail.getWordTrail();
			
			 for(String word : childWord) {
				 addWord(word);
			 }
			 
		}
		
	}
	
	
}
