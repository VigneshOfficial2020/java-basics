package basics;

public class ExercisePrograms {
	
	public static void main(String[] args) {
		
		/*
		 * int tot = 10;
		 * 
		 * for (int i=1;i<=tot;i++) {
		 * 
		 * for(int j=1;j<=i;j++) {
		 * 
		 * System.out.print(i*j+"  ");
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		
		int num = 4;
		
		for (int i=1;i<=(num*2-1);i++) {
			
			for(int j=i;j<=(num*2-1);j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
}
