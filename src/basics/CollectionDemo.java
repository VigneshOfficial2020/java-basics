package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime now = LocalDateTime.now();
		System.out.println("-------------" + now + "----------------");

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(null);
		list.add(null);
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LocalDateTime now1 = LocalDateTime.now();
		System.out.println("-------------" + now1 + "----------------");

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(null);
		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		LocalDateTime now2 = LocalDateTime.now();
		System.out.println("-------------" + now2 + "----------------");
		
		int num = getNumber();
		System.out.println("num"+num);

	}

	private static int getNumber() {

		try {

			return 10;

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally");
		}
		return 0;

	}

}
