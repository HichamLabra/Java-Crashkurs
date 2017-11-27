package katzen;

import java.util.ArrayList;


public class ArrayListGenerisch {

	public static void main(String[] args) {
		ArrayList<Siam> liste = new ArrayList<Siam>();
		Siam katze = new Siam(4, "Peter");
		
		liste.add(katze);
		liste.add(new Siam(6, "Dieter"));

		
		for(Siam element : liste){
			element.miau();
		}
		
	}
}
