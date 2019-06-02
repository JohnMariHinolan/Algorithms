package dictionary;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import FileUtils.FileUtil;

public class DIctionaryParserMain {

	private static final String FILEPATH = "C:\\Users\\JM\\eclipse-playground\\dailyprogrammer\\src\\main\\resources\\Dictionary.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Readthe wordFile.txt
		File file = FileUtil.readFile(FILEPATH);
		String[] arr = FileUtil.readFileContent(file);
		// print(arr);
		String inputWord = "ohio";

		DictionaryFinder getLongestWordNoMatch = (list, input) -> {
			String longestWrd = "";
			for (String word : list) {
				boolean containsLetter = false;
				for (char ch : input.toCharArray()) {
					if (word.contains(String.valueOf(ch))) {
						containsLetter = true;
						break;
					}
					if (!containsLetter && longestWrd.length() < word.length()) {
						longestWrd = word;
					}
				}
			}
			return "Longest word that doesnt contain any letters from " + input + " : " + longestWrd;
		};

		String input2 = "albm";
		DictionaryFinder containsOnlyGivenLetters = (list, input) -> {
			String longestWrd = "";
			T1: for (String word : list) {

				for (char ch : word.toCharArray()) {
					if (!input.contains(String.valueOf(ch))) {
						continue T1;
					}
				}
				boolean containsAllLetter = true;
				for (char ch : input.toCharArray()) {
					if (!word.contains(String.valueOf(ch))) {
						containsAllLetter = false;
						break;
					}

					if (containsAllLetter && longestWrd.length() < word.length()) {
						longestWrd = word;
					}
				}
			}
			return "Longest word that  contains only letters from " + input + " : " + longestWrd;
		};

		List<String> arrayStr = Arrays.asList(arr);
		// arrayStr.parallelStream().forEach(System.out::println);
		// arrayStr.stream().forEach(System.out::println);

		// filters the words

		String answer = containsOnlyGivenLetters.findWord(arrayStr, "niger");
		System.out.println("Longest word that doesnt contain any letters from " + inputWord + " : " + answer);

	}

}
