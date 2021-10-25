package basics;

public class Testing1 {

	protected static int a = 10;
	
	private static void check(int ab) {
		System.out.println("ab="+ab);
		ab=15;
		System.out.println("ab="+ab);
	}
	
	public static void main(String[] args) {
		
		System.out.println("static variable");
		System.out.println("a="+a);
		check(a);
		System.out.println("a="+a);
		System.out.println("-------------------------------------------------");
		
		System.out.println("local variable");
		int c=10;
		System.out.println("c="+c);
		check(c);
		System.out.println("c="+c);
		System.out.println("-------------------------------------------------");
		
		System.out.println("inc & dec ");
		int ab = a;
		System.out.println("ab= "+ab);
		
		System.out.println("a++ = "+a++);
		System.out.println("a="+a);
		a=ab;
		System.out.println("a-- = "+a--);
		System.out.println("a="+a);
		a=ab;
		
		
	}

}
