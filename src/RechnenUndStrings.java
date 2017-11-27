
public class RechnenUndStrings {

	public static void main(String[] args) {
		String wort = "Das ist sogar ein ganzer Satz!";
		System.out.println(wort);
		System.out.println(" :D");
		System.out.println(wort + " :D");
		
		int int1 = 42;
		int int2 = 7;
		int int3 = 42 + 7;
		System.out.println("42 + 7 = " + int3);
		
		int int4 = int1 + int2;
		System.out.println("int1 + int2 = " + int4);
		
		int int5 = int1 - 2;
		System.out.println("int1 - 2 = " + int5);
		
		int1 = int1 * 2;
		System.out.println(int1);
		
		float float1 = 3.14f;
		float1 = float1 / 2.0f;
		System.out.println(float1);
		
		int1 = 10 % 7;
		System.out.println("10 % 7 = " + int1);
		
		int1 = 10 % 5;
		System.out.println("10 % 5 = " + int1);
	}

}
