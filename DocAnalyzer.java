package Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Yashika Khandelwal
 * Student ID: B1902094
 *
 * This class holds all the methods
 * for menu items in driver class
 */
public class DocAnalyzer {
	
	BinarySearchTree bst = new BinarySearchTree();
	
	private final String fileName;
	private final Scanner reader;
	
	public DocAnalyzer() throws FileNotFoundException {
		this.fileName = "";
		this.reader = null;
		File fileName = new File("src/Q1/randomWords.txt");
	}
	
	/**
	 * Constructor accepts 1 string for file name
	 * @throws FileNotFoundException 
	 */
	public DocAnalyzer(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		this.reader = new Scanner(new File(fileName));
	}

	/**
	 * a method to print all the 
	 * words in a file
	 * @throws FileNotFoundException
	 */
	public void printAll() throws FileNotFoundException {
		File fileName = new File("src/Q1/randomWords.txt");
		Scanner reader = new Scanner(fileName);
		while(reader.hasNextLine()) {
			String words = reader.nextLine();
			String word = words.replaceAll("[^a-zA-z]", "").toLowerCase();
			System.out.println(word);
		}
	}

	/**
	 * a method to print all the 
	 * distinct words in a file
	 * @throws FileNotFoundException
	 */
	 void distinctWords() throws FileNotFoundException {
		File fileName = new File("src/Q1/randomWords.txt");
		Scanner reader = new Scanner(fileName);
		while(reader.hasNextLine()) {
			String words = reader.nextLine();
			int count = 0;
			int i=0;
			while(!(words.isEmpty())) {
				if(Character.toString(words.charAt(i)).equals("")) {
					words = words.replaceAll(words.substring(0, i+1), "");
					i=0;
					count++;
				} else {
					i++;
				}
			}
		}
	}
	
	 /**
	  * a method to print the number of occurences
	  * for a particular word
	  * @param bst
	  * @return
	  * @throws FileNotFoundException
	  */
	static int numOccurs(BinarySearchTree bst) throws FileNotFoundException {
		File fileName = new File("src/Q1/randomWords.txt");
		Scanner reader = new Scanner(fileName);
		int count = 0;
		while(reader.hasNextLine()) {
			String str = reader.nextLine();
			String words[] = str.split("\n");
			for(int i=0; i<words.length; i++) {
				if(bst.equals(words[i])) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * a method to list the words that appear
	 * a certain amount of times, alphabetically
	 * @param word
	 * @throws FileNotFoundException
	 */
	public void alphabetWords(WordNode word) throws FileNotFoundException {
		File fileName = new File("src/Q1/randomWords.txt");
		Scanner reader = new Scanner(fileName);
		while(reader.hasNextLine()) {
			String str = reader.nextLine();
			String words[] = str.split("\n");
			Arrays.sort(words);
			int[] count = new int[words.length];
			for(int i=0; i<words.length; i++) {
				word.compareTo(word);
				if(true) {
					count[i]++;
				}
				System.out.println(words[i]);
			}
			
		}
	}
	
	/**
	 * a method to print all the words
	 * the frequency of occurences
	 * alphabetically
	 * @return
	 */
	static int freqOccurs() {
		return 0;
	}
	
	/**
	 * a method to print the list of line numbers 
	 * on which some word occurs
	 * @return
	 */
	static int listLineNums() {
		/**
		 * to print the list of line numbers on which some words occur
		 */
		return 0;
	}
	
		
	}



