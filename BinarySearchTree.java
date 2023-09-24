package Q1;
/**
 * 
 * @author Yashika Khandelwal
 * Student ID: B1902094
 * 
 * BST class holds all the 
 * necessary methods for handling binary 
 * search tree. It accepts node 
 * as parameter and allows insert, delete, 
 * inorder and preorder methods
 *
 */
public class BinarySearchTree {

	private WordNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	
	public void insert(String word) {
		if(isEmpty()) {
			root = new WordNode(word, 1);
		}else {
			insert(word, root);
		}
	}
	
	/**
	 * Method to recursively insert each word
	 * @param word
	 * @param root
	 */
	private void insert(String word, WordNode root) { //recursive insert
		int key = root.compareTo(root);
		if(key < 0) { //negative number
			if(root.getLeft() == null) {
				root.setLeft((new WordNode(word, 1)));
			} else {
				insert(word, root.getLeft());
			}
		} else if(key > 0) {
			if(root.getRight() == null) {
				root.setRight(new WordNode(word, 1));
			} else {
				insert(word, root.getRight());
			}
		}
	}
	
	/**
	 * inorder traversals
	 * @param root
	 */
	
	public void inorder() {
		if(isEmpty()) {
			System.out.println("Tree is Empty!");
		} else {
			inorder(root);
		}
	}
	
	private void inorder(WordNode root) {
		if(root.getLeft() != null) {
			inorder(root.getLeft());
		}
		System.out.print(root.getWord() + " ");
		if(root.getRight() != null) {
			inorder(root.getRight());
		}
	}
	/**
	 * preorder traversals
	 * @param root
	 */
	
	public void preorder() {
		if(isEmpty()) {
			System.out.println("Tree is Empty!");
		} else {
			preorder(root);
		}
	}
	
	private void preorder(WordNode root) {
		System.out.print(root.getWord() + " ");
		if(root.getLeft() != null) {
			preorder(root.getLeft());
		}
		if(root.getRight() != null) {
			preorder(root.getRight());
		}
	}
}
