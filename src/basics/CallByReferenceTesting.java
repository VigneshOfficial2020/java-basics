package basics;

class NameClass {

	String name = "";

	NameClass(String s) {
		this.name = s;
	}

}

public class CallByReferenceTesting {

	static void changeName(String s) {
		
		System.out.println("changeName s =" + s);

		s = "name changed";
		
		System.out.println("after changeName s =" + s);

	}

	static void changeName(NameClass nc) {

		System.out.println("changeName nc =" + nc.name);
		
		nc.name = "name changed";
		
		System.out.println("after changeName nc =" + nc.name);

	}

	public static void main(String[] args) {

		System.out.println("call by value testing ");

		String name = "old";

		System.out.println("name =" + name);

		changeName(name);

		System.out.println("name =" + name);

		System.out.println("-----------------------------------------");
		
		NameClass nco = new NameClass("old");
		System.out.println("name =" + nco.name);
		changeName(nco);
		System.out.println("after changed name =" + nco.name);

	}

}
