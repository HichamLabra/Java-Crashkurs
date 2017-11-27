package Dateioperationen;

import java.util.Scanner;

public class EingabenEinlesen {
	public static void main(String[] args) {
		String[] eingaben = new String[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < eingaben.length; i++) {
			eingaben[i] = sc.nextLine();
		}
		
		sc.close();
		
		for (String eingabe : eingaben) {
			System.out.println(eingabe);
		}
	}
}
