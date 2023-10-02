package bfi.basics.arrays;

public class E_MinUndMaxAddAverageImArray_M {

	public static void main(String[] args) {
		int[] myArray_1 = { 130, 164, 116, 190, 151, 123, 211, 341 };
		int[] emptyArray = {}; // Zum Testen
		
		System.out.println( "Original Array:" );
		ausgabe(myArray_1);
		System.out.print( "\n" );
		
		System.out.println( "\nErgebnis von add:" );
		System.out.println( add(myArray_1) );
		
		System.out.println( "\nErgebnis von min:" );
		System.out.println( min(myArray_1) );
		
		System.out.println( "\nErgebnis von max:" );
		System.out.println( max(myArray_1) );
		
		System.out.println( "\nErgebnis von average:" );
		System.out.println( average(myArray_1) );
	}

	private static double add(int[] myArray_1) {
		checkArrayNotEmpty(myArray_1);
		
		double sum = 0.0;
		
		for (int number : myArray_1) {
			sum += (double) number;
		}
		
		return sum;
	}

	private static double min(int[] myArray) {
		checkArrayNotEmpty(myArray);
		
		double min = (double) myArray[0];
		
		for (int number : myArray) {
			if ( (double) number < min ) {
				min = (double) number;	
			}
		}
		
		return min;
	}

	private static double max(int[] myArray) {
		checkArrayNotEmpty(myArray);
		
		double max = (double) myArray[0];
		
		for (int number : myArray) {
			if ( (double) number > max ) {
				max= (double) number;	
			}
		}
		
		return max;
	}

	private static double average(int[] myArray) {
		checkArrayNotEmpty(myArray);
		
		double sum = add(myArray);
		double average = sum / myArray.length;
		
		return average;
	}

	private static void ausgabe(int[] arrayToOutput) {
		for (int number : arrayToOutput) {
			System.out.print(number + " ");
		}
	}

	private static void checkArrayNotEmpty(int[] myArray) {
		if (myArray.length == 0) {
			System.out.println("\nArray ist leer, kein Ergebnis möglich. Programm abgebrochen.");
			System.exit(0);
		}
	}

}
