package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayAndList {
	public static void main(String[] args) {
		//From LIST TO ARRAY
		String[] words = {"hello","java","today","tommorow",};
		
		List<String>wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		//wordList.add("OFF"); Cause it's FIXED DOESN't WORK
		
		//From ARRAY to LIST have to be Object
		List<String> days = new ArrayList<>();
		
		days.add("Mondays");
		days.add("Tuesday");
		days.add("Wednesday");
		
		Object[] daysArr = days.toArray();
		
		System.out.println(Arrays.toString(daysArr));
		//////////////////////////////////////
		
		List<Integer> nums = Arrays.asList(12,343,45,56,564,23,434);
		
		
		
		
	}
	
	
			public void acceptList(int[] nums) {
				
			}
			public void acceptList2(ArrayList<Integer> nums) {
				
			}
			public List<String> getAllDays() {
				List<String> days = new ArrayList<>();
				days.add("Mon");
				days.add("Tue");
				days.add("Wed");
				days.add("Thursda");
				
			
				return days;
			}
			
			public int countAnagrams(List<String> words) {
				return 0;
			}
			

}
