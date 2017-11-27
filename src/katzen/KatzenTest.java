package katzen;

public class KatzenTest {

	public static void main(String[] args) {
		Hauskatze katze = new Siam(5, "Hans");
		katze.miau();
		Raubkatze katze2 = new Tiger(100);
		System.out.println(katze2.gewicht);

	}

}
