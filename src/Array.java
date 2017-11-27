
public class Array {

	public static void main(String[] args) {
		int[] array1;
		array1 = new int[3];
		array1[0] = 7;
		array1[1] = 42;
		array1[2] = 1337;
		
		System.out.println(array1[0]);
		
		int int1 = 3;
		int int2 = 4;
		int2 = int1;
		int2 = 5;
		System.out.println(int1);
		
		int[] array2;
		array2 = array1;
		array2[0] = 14;
		System.out.println(array1[0]); // der Wert ändert sich denn array2 auf array1 verweist, weil nur eine liste new int initialisiert wurde
	}

}
