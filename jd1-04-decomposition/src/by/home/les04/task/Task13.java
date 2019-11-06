package by.home.les04.task;

public class Task13 {

	public static void main(String[] args) {

		/*
		 * 13. Дано натуральное число N. Написать метод(методы) для формирования
		 * массива, элементами которого являются цифры числа N.
		 */

		int N = rand();
		int l = length(N);
		int[] mas = massive(N, l);
		
		print("Число: ", N);
		print("Длина числа: ", l);
		printMas(mas);

	}

	public static int rand() {
		int N = (int) (Math.random() * 90000000 + 10000);
		return N;
	}

	public static int length(int N) {
		int i = 0;
		for (; N > 0; i++) {
			N = N / 10;
		}
		return i;
	}

	public static int[] massive(int N, int i) {
		int[] mas = new int[i];
		int j = i - 1;
		for (; N > 0; N = N / 10) {
			mas[j] = N % 10;
			j--;
		}
		return mas;
	}
	
	public static void print(String n, int a) {
		System.out.println(n + a);
	}
	
	public static void printMas(int[] mas) {
		System.out.print("{");
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("}");
	}

}
