package by.home.les05.task;

public class Task13 {

	public static void main(String[] args) {

		/*
		 * 13. Определить количество элементов последовательности натуральных чисел,
		 * кратных числу М и заключенных в промежутке от L до N.
		 */

		int[] mas = array(randNum());

		int M = randMultipl();
		int L = randNum();
		int N = randRange(L);

		

		PrintArray.print(mas);

		System.out.print("Находим числа кратные " + M);
		System.out.println(" лежащие в диапазоне [" + L + "; " + N + "]");

		newArray(mas, M, L, N);


	}

	public static int randMultipl() {

		int a = (int) (Math.random() * 10 + 1);
		return a;

	}

	public static int randNum() {

		int a = (int) (Math.random() * 100 + 1);
		return a;

	}

	public static int randRange(int L) {

		int N = (int) (Math.random() * 100 + L);
		return N;

	}

	public static int[] array(int a) {

		int[] mas = new int[a];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;

	}

	public static int quantity(int[] mas, int M, int L, int N) {

		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % M == 0 & mas[i] >= L & mas[i] <= N) {
				j++;
			}
		}
		return j;

	}

	public static void newArray(int[] mas, int M, int L, int N) {

		if (quantity(mas, M, L, N) == 0) {
			System.out.println("Таких чисел нет.");
		} else {
			int[] array = new int[quantity(mas, M, L, N)];
			int j = 0;

			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % M == 0 & mas[i] >= L & mas[i] <= N) {
					array[j] = mas[i];
					j++;
				}
			}
			PrintArray.print(array);
		}
	}
}
