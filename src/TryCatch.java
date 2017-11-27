import java.io.File;
import java.util.Scanner;


public class TryCatch {
		public static void main(String[] args) {
			File daten = new File("daten.txt");
			
			try {
				Scanner sc = new Scanner(daten);
				
				while(sc.hasNext()) {
					System.out.println(sc.nextLine());
				}
				
				sc.close();
				
			} catch (Exception e) {
				System.out.println("Fehler: Datei nicht gefunden.");
			}
			
			
		}
	}


