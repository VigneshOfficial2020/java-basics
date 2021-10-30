package basics;

public interface TestingInterface {
	
	int a = 10;
	
	void print();
	
	default void show() {}

	static void showStatic() {}
	
	// Illegal modifier for the interface method showFinal; only public, private, abstract, default, static and strictfp are permitted
	//public static final void showFinal() {}

}
