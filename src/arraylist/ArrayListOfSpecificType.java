package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfSpecificType {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		ArrayList<Integer> listOfInts = new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C#");
		list.add("JavaScrit");
		//list.add(1234); will not compile cuse not a string;
		list.add(3,"R");
		
		System.out.println(list);
		
		listOfInts.add(233);
		listOfInts.add(2123);
		listOfInts.add(2432);
		listOfInts.add(122);
		listOfInts.add(23);
		listOfInts.add(22);
		
		for(Integer numb :listOfInts ) {
			if(numb % 2!=0) {
				System.out.print(numb+",");
			}
		}
		System.out.println("==================");
		
		
		List <String> shopingList = new ArrayList<>();
		shopingList.add("Milk");
		shopingList.add("Orage Juice");
		shopingList.add("Eggs");
		shopingList.add("Pasta");
		shopingList.add("Chocholate");
		shopingList.add(0,"Guacomole");
		shopingList.add("Tomatos");
		System.out.println(shopingList);
		shopingList.set(6,"Salsa");
		
		System.out.println(shopingList);
		//Finding position of Eggs
		int index=shopingList.indexOf("Eggs");
		
		
		shopingList.set(index,"Chees");
		System.out.println(shopingList);
		
		System.out.println(shopingList.contains("Milk"));
		
		shopingList.remove("Eggs");
		System.out.println(shopingList);
		
		shopingList.remove(0);
		System.out.println(shopingList);
		
		if(shopingList.isEmpty()) {
			System.out.println("YEs it is EMPTY");
			System.out.println(shopingList);
		}else {
			shopingList.clear();
			
		}
		
		if(shopingList.isEmpty()) {
			System.out.println("YEs it is EMPTY");
			System.out.println(shopingList);
		}else {
			shopingList.clear();
		}
		
	
		
		
	
		
	}
	
	
	
		
		

}
