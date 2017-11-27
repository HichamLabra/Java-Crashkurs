public class SwitchCase {

	public static void main(String[] args) {
		String monat = "01";

		switch (monat){
			case  "1" :
			case "01" :	System.out.println("Januar");
						break;
			case  "2" :
			case "02" :	System.out.println("Februar");
						break;
			case  "3" :
			case "03" :	System.out.println("März");
						break;
			case  "4" :
			case "04" :	System.out.println("April");
						break;
			case  "5" :
			case "05" :	System.out.println("Mai");
						break;
			case  "6" :
			case "06" :	System.out.println("Juni");
						break;
			case  "7" :
			case "07" :	System.out.println("Juli");
						break;
			case  "8" :
			case "08" :	System.out.println("August");
						break;
			case  "9" :
			case "09" :	System.out.println("September");
						break;
			case "10" :	System.out.println("Oktober");
						break;
			case "11" :	System.out.println("November");
						break;
			case "12" :	System.out.println("Dezember");
						break;
			default : 	System.out.println("Kein Monat");
		}
		

	}

}
