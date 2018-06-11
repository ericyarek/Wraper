package wrapperclasses;

public class ComparigWrappers {
	public static void main(String[] args) {
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(10);
		
		Boolean b = n1==n2;
		
		System.out.println(b);
		
		b= n1.equals(n2);
		System.out.println(b);
		
		b= n1==10;
		System.out.println(b);
		
		//Value OF
		//-128 to 127 -true - Then it uses same object.
		Integer q = Integer.valueOf(-129);
		Integer q2 = Integer.valueOf(125);
		Integer q3=125;
		
		System.out.println(q3==q2);
		
		Integer intValue =100;
		Short shortValue =100;
		
		
		System.out.println(intValue.equals(shortValue));
		//System.out.println(intValue ==shortValue); //wont compile as it is
		
		int i=12;
		short i1=12;
		System.out.println(i == i1);
		
		
		
	}
	
}
