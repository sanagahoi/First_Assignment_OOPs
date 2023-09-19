package com.oops.problems;

public class TypeCastingDemo {
	public static void main(String[] args) {
		
		//widening - small datatype value can be assigned to large datatype value
		
		//automatic typeCasting for compatible data type
		
				byte abyte = 70;
				short  ashort = 200;
				int aint = 2134;
				long along = 1233545L;
				
				float f = aint;
				System.out.println("float value : " + f);
				
				along = aint;
				System.out.println("long value : " + along);
				
				aint = ashort;
				System.out.println("integer value : " + aint);
				
				ashort = abyte;
				System.out.println("short value : " + ashort);
				
				
				//narrowing - large datatype value can be assigned to smaller datatype value
		
		// Manual typecasting double to integer typecasting
				double d1 = 23.34;
				double d2 = 2.2;
				long lvalue = 1233L;
				 
				int y = (int) d1;
				int x = (int) (d1/d2);
				System.out.println(x);
				System.out.println(y);
		//manual typecasting long to short (64 bit to 8 bit)
		
		short svalue = (short) (lvalue);
		System.out.println(svalue);
		
		lvalue = 123263276L;
		 svalue = (short) (lvalue);
		System.out.println("short from long : " + svalue);
		
		
//		according to the ASCII code 65-A and 70-F
		
		char cvalue = (char) (abyte);
		System.out.println("char value : " + cvalue);
		String eng = "Sapna Gupta";
		System.out.println(eng);
		String str = " सपना गुप्ता ";
		System.out.println(str);
	}
}
