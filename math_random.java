public class math_random {

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		double r = Math.random();

		int value = (int) (r * n);
		System.out.println(value);
		System.out.println(r);
	}
}