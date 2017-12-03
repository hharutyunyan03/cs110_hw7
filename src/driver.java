import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;

public class driver {
	public static void main(String[] args) {
		
		double number = 15.4;
		System.out.println(Math.factorial((int)number));
	
		Puppy Joey = new Puppy("Joey");
		Puppy Chandler = new Puppy("Chandler");
		Puppy Ross = new Puppy("Ross");
		
		System.out.println(Joey.getName());
		System.out.println(Chandler.getName());
		System.out.println(Ross.getName());
		
		
		int[] array = {9, 20, 3, 44, 88, 300};
		System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(array)));
}
}
