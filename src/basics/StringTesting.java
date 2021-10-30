package basics;

public class StringTesting {

	public static void main(String[] args) {

		// equals() -> matches content
		// == -> matches the object reference
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "java";

		String s4 = new String("java");
		
		// s1==s2
		System.out.println(s1 == s2);
		
		// s1==s3
		System.out.println(s1==s3);
		
		// s1==s4
		System.out.println(s1==s4);
		
		s1 = s1 + "J2EE";
		
		System.out.println(s1==s2);
		
	}

}
