package chapter02;

public class ArrayUtils {
	public static double[] intToDouble(int[] intArray) {
		double[] result = new double[intArray.length];

		for (int i = 0; i < intArray.length; i++) {
			result[i] = (double) intArray[i];
		}

		return result;
	}

	public static int[] doubleToInt(double[] dArray) {
		int[] result = new int[dArray.length];

		for (int i = 0; i < dArray.length; i++) {
			result[i] = (int) dArray[i];
		}
		return result;
	}

	public static int[] concat(int[] intArray, int[] intArray2) {
		int count=0;
		int[] result = new int[intArray.length + intArray2.length];
		
		for (int i=0; i<intArray.length; i++){
			result[count++] = intArray[i];
		}
		
		for (int i=0; i<intArray2.length; i++){
			result[count++] = intArray[i];
		}
		return result;
	}
}
