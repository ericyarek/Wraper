package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CompareLists {
	public static void main(String[] args) {
		
		List<String> booksInShelf1 = new ArrayList<>();
		List<String> booksInShelf2 = new ArrayList<>();
		
		booksInShelf1.add("OCA Preparation");
		booksInShelf1.add("OCA/OCP Practice");
		booksInShelf1.add("Pearl of Wisdom");
		booksInShelf1.add("10x Rule");
		
		booksInShelf2.add("OCA Preparation");
		booksInShelf2.add("OCA/OCP Practice");
		booksInShelf2.add("Pearl of Wisdom");
		booksInShelf2.add("10x Rule");
		
		//---Equals method cheks same data in the same positio
		
		if(booksInShelf1.equals(booksInShelf2)) {
			System.out.println("Same books and same order in both Shelves");
		}else {
			System.out.println("It's either some books are missing or there is different");
		}
		
		booksInShelf2.add(0,"Garry Poter");
		booksInShelf1.add("Garry Poter");
		// Checks ORDER AND VALUE 
		if(booksInShelf1.equals(booksInShelf2)) {
			System.out.println("Same books and same order in both Shelves");
		}else {
			System.out.println("It's either some books are missing or there is different");
		}
		//CHECKS ALL THE VALUE IS THERE either way
		if(booksInShelf1.containsAll(booksInShelf2)) {
			System.out.println("Same books and same order in both Shelves");
		}else {
			System.out.println("It's either some books are missing or there is different");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
