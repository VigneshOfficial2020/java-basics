package basics;

public class TestingInterfaceClass implements TestingInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	//Cannot reduce the visibility of the inherited method from TestingInterface
	/*
	 * @Override default void show() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	// The method showStatic() of type TestingInterfaceClass must override or implement a supertype method
	/*
	 * @Override static void showStatic() {
	 * 
	 * 
	 * }
	 */
	
}
