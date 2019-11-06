package by.home.les05.task;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		 * которые кратны данному К.
		 */

		int N = rand();
		int K = rand();
		int[] mas = array(N);

		System.out.println("Длина массива: " + N);
		PrintArray.print(mas);
		System.out.println("Сумма чисел кратных " + K + " : " + sum(mas, K));

	}

	public static int rand() {
		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int[] array(int a) {
		int[] mas = new int[a];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand();
		}
		return mas;
	}

	public static int sum(int[] mas, int b) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % b == 0) {
				sum = sum + mas[i];
			}
		}
		return sum;
	}
}
