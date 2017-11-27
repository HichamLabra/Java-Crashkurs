package Dateioperationen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AusDateiLesen {
	public static void main(String[] args) throws FileNotFoundException {
		File daten = new File("daten.txt");
		
		Scanner sc = new Scanner(daten);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		sc.close();
	}
}
