package arraylist;

import java.util.ArrayList;

public class BasicArrayList {
	public static void main(String[] args) {
		
		ArrayList cards =new ArrayList();
		cards.add("MC");
		cards.add("MC");
		cards.add("VISA");
		cards.add("AMex");
		cards.add("Discovery");
		cards.add(false);
		cards.add(1,12554.4564);
		
		System.out.println(cards);
		
		cards.add(0,"JAVA");	
		System.out.println(cards);
		
		
		System.out.println(cards.get(5));
		System.out.println(cards.get(1));
		
		
		for(Object c: cards) {
			System.out.println(c);
		}
		System.out.println("==============");
		for(int i=0; i<cards.size(); i++) {
		System.out.println(cards.get(i));
	}
		
		
		
		
		
		
	}

}
