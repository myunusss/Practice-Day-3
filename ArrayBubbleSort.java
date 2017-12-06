public class ArrayBubbleSort{

	static void bubbleSort(int[] arr){
		int temp = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++){
			for (int j = 1; j < (n-i); j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}


	public static void main (String[] args){
		int[] arr = {78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63, 75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73};
		int min, max;
		System.out.println("Before Sort : ");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);

		System.out.println("After Sort : ");
		for ( int i = 0; i < arr.length ;i++ ) {
			System.out.print(arr[i] + " ");
		}
		min = arr[0];
		max = arr[0];

		for ( int i = 0; i < arr.length ;i++ ) {
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}

		System.out.println("\nNilai terkecil = " + min);
		System.out.println("Nilai terbesar = " + max);

		System.out.print("Nilai Minimum : ");
		for (int i = 0; i < 5; i++){
			System.out.print(arr[i] + " ");
		}

		int x = arr.length -1;
		int jumlah = 0;
		double average;

		System.out.print("\nNilai Maks : ");
		
		for ( int i = 0; i < 5 ;i++ ) {
			System.out.print(arr[x - i] + " ");
		}

		for (int i = 0; i < x; i++){
			jumlah = jumlah + arr[i];
		}

		average = jumlah / x;
		System.out.print("\nJumlah : " + average);
	}
}