package Q1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Yashika Khandelwal
 * Student ID: B1902094
 *
 * Driver class for BST implementation
 */
public class Driver {

	public static void main(String[] args) throws IOException {
		
		DocAnalyzer da = new DocAnalyzer();
		
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What to do next, The options are: ");
		char choice;
		do {
			System.out.println(" 1. Print all the words \n"
					+ " 2. Print the number of distinct words \n"
					+ " 3. Print the number of occurences of a particular word \n"
					+ " 4. Print all the words that appear more than a certain amount of times, alphabetically \n"
					+ " 5. Print all the words, with the frequency of occurences, that occur alphabetically on or after some word1 and on or before some word2 \n"
					+ " 6. Print out a list of line numbers on which some word occurs \n"
					+ " 7. Quit \n"
					+ " Your Choice: ");
			choice = input.next().charAt(0);
			
			switch(choice) {
				
			case '1':
				da.printAll();
				break;
			case '2':
				da.distinctWords();
				break;
			case '3':
				da.numOccurs(null);
				break;
			case '4':
				da.alphabetWords(null);
				break;
			case '5':
//				da.freqOccurs();
				break;
			case '6':
//				da.listLineNums();
				break;
			case '7':
				System.out.println("You have exited the program!");
				break;
			default:
				break;
			}
		}while(choice != '7');
		
		
	}
}
