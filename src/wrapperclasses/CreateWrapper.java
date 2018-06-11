package wrapperclasses;

public class CreateWrapper {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		System.out.println(i);
		
		Integer n = 123; //automatically convert to Integer object from int
							//Process is called an Auto-boxing
		System.out.println(n);
		
		Double d = new Double(223.55);//
		Double d2 =55.33;// 2 steps: take 55.33 value and create an object of
						// double wraper class and assign to d2(refer It)
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(d.equals(d2));
		System.out.println(d.compareTo(d2));
		
		Character ch = new Character('A');
		System.out.println(ch.equals('B'));
		System.out.println(ch.compareTo('A'));
		//======================================
		
		//1)Using new keyword:
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("False");
		
		System.out.println(b1);
		System.out.println(b2);
		
		//2) Direct assignment
		Double dVal =800.12;
		Boolean b3 =false;
		
		//3 ValueOF creating WRAPPER CLASS
		Integer count =Integer.valueOf(4000);
		Integer result =Integer.valueOf("123123123");
		
		Character ch1 = Character.valueOf('P');
		
		
		System.out.println(count);
		System.out.println(result);
		System.out.println(ch1);
		
	//========================================================
		
		//Convert from Wrapper to Primitive
		
		Integer num1 =new Integer(100);
		
		int num2 =num1;//unboxing from Integer object to int primitive

		System.out.println(num2);
		
		//Autoboxing int-> Integer
		int k=345;
		Integer k1 = k;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
