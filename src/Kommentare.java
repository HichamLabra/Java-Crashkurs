
public class Kommentare {

	public static void main(String[] args) {
		String modus = "Singleplayer"; // gewaehlter Spielmodus

		if (modus == "Singleplayer") { // ist der Singeplayer-Modus ausgewaehlt?
			System.out.println("Spielwelt wird geladen . . ."); // Daten laden etc.
		} else if (modus == "Multiplayer") { // oder der Multiplayer-Modus?
			System.out.println("Spielwelt wird geladen . . ."); // Daten laden etc.
		}

		
		// ist eine der beiden Modi ausgwaehlt?
		if (modus == "Singleplayer" | modus == "Multiplayer") {
			System.out.println("Spielwelt wird geladen . . ."); // Daten laden etc.
		}
		
		
		// Auswahl prüfen (mit Abkuerzung)
		if (modus == "Singleplayer" || modus == "Multiplayer") { 
			System.out.println("Spielwelt wird geladen . . ."); // Daten laden etc.
		}


		boolean spielGekauft = false; // wurde das Spiel gekauft?
		int alter = 17; // Alter des Spielers

		if (spielGekauft & (alter >= 16)) { // sind beide Bedingungen erfuellt?
			System.out.println("Spielwelt wird geladen . . .");
		}


		/* Sind alle notwendigen Bedingungen erfuellt? 
		  ist das Spiel gekauft worden UND der Spieler mind. 16
		  UND
		  wurde einer der beiden gültigen Modi ausgewaehlt? */
		if ( (spielGekauft && alter >= 16) && (modus == "Multiplayer" | modus == "Singleplayer") ) {
			System.out.println("Spielwelt wird geladen . . .");
		}
		
		/* Zusammenfassung:
	    Vergleiche
	        Operator    Erklaerung
	        ==          Pruefung auf Gleichheit
	        !=          Pruefung auf Ungleichheit
	        <=          Pruefung auf kleiner oder gleich
	        >=          Pruefung auf groesser oder gleich
	        <           Pruefung auf kleiner als
	        >           Pruefung auf groesser als

	    Logische Operatoren
	        Operator    Erklaerung
	        &&          Beide Bedingungen muessen wahr sein
	        ||          Mindestens eine Bedingung muss wahr sein */
	}

}
