package by.home.les04.task;

public class Task08 {

	public static void main(String[] args) {

		/*
		 * 8. Составить программу, которая в массиве A[N] находит второе по величине
		 * число (вывести на печать число, которое меньше максимального элемента
		 * массива, но больше всех других элементов).
		 */

		int N = rand();
		
		System.out.println(N);
		
		int[] A = randMas(N);
		
		print(A);
		
		int[] As = sort(A);
		
		print(As);
		int max = findMax(As);
		
		System.out.println(max);
	}

	public static int rand() {
		int a = (int) (Math.random() * 20 + 3);
		return a;
	}

	public static int[] randMas(int N) {
		int[] mas = new int[N];
		for (int i = 0; i < N; i++) {
			mas[i] = rand();
		}
		return mas;
	}
	
	public static int[] sort(int[] mas) {
		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = 0; j < mas.length - i - 1; j++) {
				if(mas[j] > mas[j + 1]) {
					int temp = mas[j];			
					mas[j] = mas[j + 1];		
					mas[j + 1] = temp;		
				}
			}
		}
		return mas;
	}
	
	public static void print(int[] mas) {
		System.out.print("{");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");				
		}
		System.out.println("}");
	}
	
	public static int findMax(int[] mas) {
		int n = mas[mas.length - 1];
		int max = mas[mas.length - 1];
		for(int i = mas.length - 2; i >= 0;i--) {
			if (n > mas[i]) {
				max = mas[i];
				break;
			}
		}
		return max;
	}

}
