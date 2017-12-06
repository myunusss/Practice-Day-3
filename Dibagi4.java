public class Dibagi4{

	public static void main(String[] args){
		int number = 0;

		for (int i = 0; i <= 250; i++){
			if (i %4 == 0 && i >= 200){
				System.out.print(i + " ");
			}
		}
	}
}