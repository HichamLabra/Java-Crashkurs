package katzen;

public class Siam extends Hauskatze {
	Siam(int gewicht, String name) {
		super("Siam", gewicht, name);
	}

	// So miaut eine Siam Katze
	 void miau() {
		System.out.println("Miauuu!");
	}

}
