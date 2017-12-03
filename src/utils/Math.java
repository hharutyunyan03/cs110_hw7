package utils;

public class Math {

	public static long factorial(int n) {
		if(n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	
	public static long factorialLoop(int m) {
		int result = 1;
		for(int i = 1; i <= m; i++ ) {
			result = result * i;
		}
		return(result);
	}
}
