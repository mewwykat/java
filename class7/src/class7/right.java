package class7;
import java.util.Scanner;

public class right {
	
	public static void main(String[] args) {
		int[] record = inputMethod();
		// what this function 1 does: return these values (where I count how many histrograms per grade) this is why this is an array in int
		displayHistogram(record);
		// this the the second method, already have the below values inherited
		
	}
	
	static int[] inputMethod(){
		int[] hist=new int[5];
		Scanner in = new Scanner(System.in);
		int inputValue;
		do {
			System.out.println("Enter x? (-1 to exit)");
			inputValue = in.nextInt();
			if (inputValue >= 90 && inputValue <=100) ++hist[0];
			else if (inputValue >= 80) ++hist[1];
			else if (inputValue >= 80) ++hist[1];
			else if (inputValue >= 80) ++hist[1];
			else if (inputValue >= 80) ++hist[1];
			else System.out.println("End");
		} while (inputValue != -1);
		in.close();
		return hist; 
		
		// this is going back to the int[] hist in the beginning 
	}
	
	static void displayHistogram(int[] cnt) {
		int total =0;
		for(int i=0; i<cnt.length; i++) {
		total += cnt[i];
	}
		System.out.printf("total: %d\n", total);
		
		int[] tick = {0, 60, 70, 80, 90, 101};
		for (int i=0; i<5)
			
			// this part is all about the adding up histogram
}
