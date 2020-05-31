package whileloopdemo;

public class App01 {
	public static void main(String[] args) {
		int a = 23;
		boolean ble = a < 28;

		while (a < 34) {   //loop will never ends
			System.out.println("okey" +"  "+a);
			a=a+2;// update upto condition will flase
		}
	}
}
