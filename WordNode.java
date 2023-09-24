package Q1;

import java.util.ArrayList;

/**
 * @author Yashika Khandelwal
 * Student ID: B1902094
 *
 * This class is used to represent an entry 
 * in the text file
 * 
 * comparable to sort alphabetically
 */
public class WordNode implements Comparable<WordNode>{

	private String word;
	private int counter;
	private ArrayList<Integer>lineNum;
	
	private WordNode left, right;
	
	/*
	 * Constructor
	 */
	public WordNode(String word, int line) {
		this.word = word;
		this.counter = 1;
		this.lineNum = new ArrayList<>();
		this.lineNum.add(line);
		left = right = null;
	}
	
	/*
	 * Getters and Setters
	 */
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public ArrayList<Integer> getLineNum() {
		return lineNum;
	}

	public WordNode getLeft() {
		return left;
	}

	public void setLeft(WordNode left) {
		this.left = left;
	}

	public WordNode getRight() {
		return right;
	}

	public void setRight(WordNode right) {
		this.right = right;
	}

	public void increase() {
		counter++;
	}
	
	public void addLine(int line) {
		lineNum.add(line);
	}
	
	public String toString() {
		return word + counter + lineNum;
	}
	
	/*
	 * Implemented comparable method
	 * in order to compare objects 
	 * alphabetically 
	 */
	@Override
	public int compareTo(WordNode obj) {
		return getWord().compareTo(obj.getWord());
	}
}
