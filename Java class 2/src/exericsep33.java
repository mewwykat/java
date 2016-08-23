
public class exericsep33 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 100);
		int y = (int) (Math.random() * 100);
		int z = (int) (Math.random() * 100);
		if ((x > y) && (x > z))
		System.out.println("x is the largest");
		else if ((y > x) && (y > z))
		System.out.println("y is the largest");
		else if ((z > x) && (z > y))
		System.out.println("z is the largest");
	}
}
