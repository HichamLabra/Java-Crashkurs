
public class Funktionen {

	public static void main(String[] args) {
		addition();

		int ergSubtraktion = subtraktion();
		System.out.println(ergSubtraktion);

		multiplikation(7, 6);

		int ergDivision = division(42,7);
		System.out.println(ergDivision);
	}
	
	static void addition() {
		int zahl1, zahl2; // 2 int gleichzeitig anlegen
		 // Zahlen einlesen . . .
		zahl1 = 7;
		zahl2 = 42;
		System.out.println(zahl1 + zahl2);
	}

	static int subtraktion() {
		int zahl1, zahl2;
		 // Zahlen einlesen . . .
		zahl1 = 7;
		zahl2 = 6;
		return zahl1 - zahl2;
	}

	static void multiplikation(int a, int b) {
		System.out.println(a * b);
	}

	static int division(int a, int b) {
		return a / b;
	}

}
