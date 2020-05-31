package whileloopdemo;

public class Ifdemo01 {
	public static void main(String[] args) {
		int a = 0;
		while (true) {
			System.out.println("its loop:" + " " + a);
			if (a == 6) {
				break;
			}
			a++;
			System.out.println("out of loop");
		}
	}
}
