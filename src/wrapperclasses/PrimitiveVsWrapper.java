package wrapperclasses;

public class PrimitiveVsWrapper {
	public static void main(String[] args) {
		Integer intV = new Integer(234);
		Integer intV2 = new Integer(234);
		
		int n = 234;
		
		System.out.println(intV==n);//-> True because intV ->unboxed to a primitive
		System.out.println(intV==intV2);
	}

}
