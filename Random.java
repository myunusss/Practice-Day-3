public class Random{
	public static void main(String[] args){
		int a;
		int[] c = new int[5];

		for (int i=0; i < 5; i++){
			a = 11 + (int)(Math.random() * 20);
			if (a != 0 && a > 11){
				c[i] = a;
			}
		}
		for (int b : c){
			System.out.println(b);
		}
	}
}