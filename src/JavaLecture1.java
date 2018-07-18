public class JavaLecture1 {
	public static void main(String[] args) {
		// this is comment
		/* 
		 * this
		 * is
		 * an
		 * example 
		 * of long
		 * paragraph */
		// Java Naming Convention
		// Class names should begin with a capital letter
		// Constants should be all capital --> PI
		// methods, packages, variables, and almost anything else in Java
		// should be in lower case
		// When you are stringing words together to name something
		// such as the file name for this class, use CamelCase
		// example variable --> firstName
		// example class --> MyFirstClass
		//example constant --> SALESTAX
		
		
		/* 8 Primitive Types 
		 * 4 Integer types are: byte, short, int, long
		 * */
		byte myByte = 127; //this variable is initialized
		short myShort = 32000;
		int myInt = 1000;
		long myLong = 1000000;
		byte myByte2; // this is declared, but not initialized
		myByte2 = myByte; //it was not initialized
		myByte = 120; //it is now reassigned
		
		/* 2 decimal types of primitives: float and double */
		
		float myFloat = 1.0f;
		double myDouble = 2.3; //use double when type decimals
		
		/* non-numerical primitives */
		// boolean takes one of two calues, either true or false
		boolean myBoolean = true;
		boolean myBoolean2 = false;
		
		// char is EXACTLY one character
		char myChar = 'a';
		System.out.println("This prints on one line then goes to the next");
		//System.out.print("This prints on one line then stays here");
		//System.out.print("...See what I mean?");
		System.out.println("My Character is " + myChar);
		System.out.println("My Character is " + myInt);
		
		// Strings --> sequence of characters (pr they can also be a single character
		String myString = "Arcadio";
		// 				   0123456
		System.out.println("My String is " + myString);
		
		String myString2 = "Another String";
		//                  01234567....
		System.out.println(myString + myString2);
		System.out.println("My String is " + myString);
		System.out.println("This was my first string " + myString + " and this was my second: " + myString2);
		
		int x = 10;
		int y = 11;
		System.out.println("the sum of x and y is " + (x + y));
		System.out.println(myString.charAt(1) ); //call the charAt method on myString
		// overloading means two same name with different arguments
		System.out.println(myString.substring(1));// call the substring method on myString --> get the second character on...
		System.out.println("My String is: " + myString);
		
		//Escape characters
		System.out.println("Printing special characters \' \" or \\");
		System.out.println("This is one line\nThis is the next");
		System.out.println("This is one line\rThis is the next");
		System.out.println("\tThis is tabbed in!");
		
		//Constants --> must be all capitalized
		final double TAXRATE = 6.25;
		//TAXRATE = 10; // Cannot reassign a constant		
		System.out.println("pi = " + Math.PI);	
		
		//Arrays
		int [] intsA = {1,2}; // where and what
		int [] intsB = new int[2]; // where and leave this amount of space and will fill it later
		String [] myStrings = {"Neil", "Me"}; // String array
		System.out.println(intsB[0]);
		System.out.println(intsB[1]);
		System.out.println(intsA[0]);
		System.out.println(intsA[1]);
		
		intsB[0] = 3;
		intsB[1] = 4;
		System.out.println(intsB[0]);
		System.out.println(intsB[1]);
		
		System.out.println(myStrings[0] + " and " + myStrings[1]);
	}//end of the main method
}//end of JavaLecture1
