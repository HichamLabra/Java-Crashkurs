
public class LogischeAusdruecke {

	public static void main(String[] args) {
		String modus = "Singleplayer";

		if (modus == "Singleplayer") {
			System.out.println("Spielwelt wird geladen . . .");
		} else if (modus == "Multiplayer") {
			System.out.println("Spielwelt wird geladen . . .");
		}
		
		
		if (modus == "Singleplayer" || modus == "Multiplayer") {
			System.out.println("Spielwelt wird geladen . . .");
		}

		
		boolean spielGekauft = false;
		int alter = 17;

		if (spielGekauft && alter >= 16) {
			System.out.println("Spielwelt wird geladen . . .");
		}


		if ( (spielGekauft && alter >= 16) && (modus == "Multiplayer" || modus == "Singleplayer") ) {
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
