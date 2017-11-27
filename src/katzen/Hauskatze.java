package katzen;

public class Hauskatze extends Katze {
	String name;	// Name der Hauskatze

	// Konstruktor. Man beachte den Aufruf von super(...)
	Hauskatze(String rasse, int gewicht, String derName) {
		super(rasse, gewicht);
		this.name = derName;
	}
	
	void miau() {			// Die Hauskatze gibt ein Miau auf der Konsole aus
		System.out.println("Miau");// Kann fuer jede Hauskatzen Rasse unterschiedlich sein
	} 	
}