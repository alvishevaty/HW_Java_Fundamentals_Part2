package by.home.les04.task;

public class Task15 {

	public static void main(String[] args) {

		/*
		 * 15. Даны натуральные числа К и N. Написать метод(методы) формирования массива
		 * А, элементами которого являются числа, сумма цифр которых равна К и которые
		 * не большее N.
		 */

		int K = 15; // rand();
		int N = 100; // rand();
		int j = length(N, K);
		int[] A = massive(N, K, j);

		System.out.println(K);
		System.out.println(N);
		System.out.println(j);

		printMas(A);

	}

	public static int rand() {
		int N = (int) (Math.random() * 1000 + 1);
		return N;
	}

	public static int length(int N, int K) {
		int j = 0;
		for (int i = 0; i < N; i++) {
			int a = i;
			int sum = 0;
			for (; a > 0; a = a / 10) {
				int l = a % 10;
				sum = sum + l;
				if (sum == K) {
					j++;
				}
			}
		}
		return j;
	}

	public static int[] massive(int N, int K, int j) {
		int[] mas = new int[j];
		int n = 0;
		for (int i = 0; i < N; i++) {
			int a = i;
			int sum = 0;
			for (; a > 0; a = a / 10) {
				int l = a % 10;
				sum = sum + l;
				if (sum == K) {
					mas[n] = i;
					n++;
				}
			}
		}
		return mas;
	}

	public static void printMas(int[] mas) {
		System.out.print("{");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println("}");
	}

}
