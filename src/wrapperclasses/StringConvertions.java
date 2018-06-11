package wrapperclasses;

public class StringConvertions {
	public static void main(String[] args) {
		String str = "1234";
		//Make sure value of str is more then 0;
		
		Integer i = Integer.valueOf(str);
		int count1 = Integer.parseInt(str);
		int Frase = count1+2;
		
		if(i>0) {
			System.out.println("It is more then 0 "+Frase);
			
		}else {
			System.out.println("Not more then 0");
			
					
		}
		
		String searchCount = "123455";
		//1)convert this to Integer wrapper class
		Integer searchInt= Integer.valueOf(searchCount);
		// it is UNBOXING ObjEct >primtive
		int searchInt2= Integer.valueOf(searchCount);
		
		//2)convert to int
		int searchIntpr  = Integer.parseInt(searchCount);
		//it is AUTO-BOXING primitive> Object
		Integer searchIntpr2= Integer.valueOf(searchCount);
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
