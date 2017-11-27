package katzen;

public class Raubkatze extends Katze {
	String beute;	// Bevorzugte Beute der Raubkatze 

	// Konstruktor. Man beachte den Aufruf von super(...)
	Raubkatze(String rasse, int gewicht, String dieBeute) {
		super(rasse, gewicht);
		this.beute = dieBeute;
	}

}
