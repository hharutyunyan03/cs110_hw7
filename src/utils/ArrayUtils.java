package utils;

public class ArrayUtils {
	
	public static int[] reverse(int[] arr) {
		int[] arrReverse = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arrReverse[i] = arr[arr.length - 1 - i];
		}
		return arrReverse;
	}
	
	
	public static String stringifyArray(int[] arr) {
		String str = "" + arr[0];
		for(int i = 1; i < arr.length; i++) {
			str = str + ", " + arr[i];
		}
		return str;
	}

}

