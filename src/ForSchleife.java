
public class ForSchleife {

	public static void main(String[] args) {
		int[] spieler = new int[10];

	    //	Zählvar. anlegen | Bedingung | nach jedem Durchlauf
		for (int zaehler = 0; zaehler < spieler.length; zaehler++) {
			spieler[zaehler] = zaehler + 1;
		}
		
		/* spieler[0] = 1
		   spieler[1] = 2
		   spieler[2] = 3
		   spieler[3] = 4
		   spieler[4] = 5 */
	
	
		for(int eintrag : spieler) {
			System.out.println("Spieler " + eintrag + " ist im Spiel.");
		}

	}

}
