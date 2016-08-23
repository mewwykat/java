
public class exercise33javacorrect {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 100);
		int y = (int) (Math.random() * 100);
		int z = (int) (Math.random() * 100);
		int max = x; 
		if (y > max) max = y;
		if (z > max) max =z; 
		System.out.println(x);
		System.out.println("max =" + max);
	}
}
