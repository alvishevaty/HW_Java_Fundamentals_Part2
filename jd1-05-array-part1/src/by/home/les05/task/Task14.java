package by.home.les05.task;

public class Task14 {

	public static void main(String[] args) {

		/*
		 * Дан одномерный массив A[N]. Найти: max(a2, a4, ,ak ) + min( a1, a3, , ak+1)
		 */

		int N = randLen();
		int k = randRange(N);

		int[] mas = array(N);

		System.out.println("Длина основного массива: " + N);
		System.out.println("Конечный номер для новых массивов: " + k);

		PrintArray.print(mas);

		PrintArray.print(evenArray(mas, k));
		PrintArray.print(oddArray(mas, k));

		System.out.println("Максимальное значение среди элементов с четным номером: " + maxOfEven(evenArray(mas, k)));
		System.out.println("Минимальное значение среди элементов с нечетным номером: " + minOfOdd(oddArray(mas, k)));

		System.out.println("Сумма приведенных элементов: " + sum(evenArray(mas, k), oddArray(mas, k)));

	}

	public static int randLen() {

		int a = (int) (Math.random() * 50 + 10);
		return a;

	}

	public static int randNum() {

		int a = (int) (Math.random() * 100 + 1);
		return a;

	}

	public static int randRange(int N) {

		int k = (int) (Math.random() * 50 + 10);

		while (k > N) {
			k = (int) (Math.random() * 50 + 10);
		}
		return k;

	}

	public static int[] array(int a) {

		int[] mas = new int[a];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;

	}

	public static int evenArrayLen(int[] mas, int k) {

		int j = 0;

		for (int i = 0; i < k; i++) {
			if (i % 2 != 0) {
				j++;
			}
		}
		return j;
	}

	public static int oddArrayLen(int[] mas, int k) {

		int j = 0;

		for (int i = 1; i < k + 1; i++) {
			if (i % 2 == 0) {
				j++;
			}
		}
		return j;
	}

	public static int[] evenArray(int[] mas, int k) {

		int[] array = new int[evenArrayLen(mas, k)];
		int j = 0;

		for (int i = 0; i < k; i++) {
			if (i % 2 != 0) {
				array[j] = mas[i];
				j++;
			}
		}
		return array;
	}

	public static int[] oddArray(int[] mas, int k) {

		int[] array = new int[oddArrayLen(mas, k)];
		array[0] = mas[0];
		int j = 1;

		for (int i = 1; i < k; i++) {
			if (i % 2 == 0) {
				array[j] = mas[i];
				j++;
			}
		}
		return array;
	}

	public static int maxOfEven(int[] mas) {

		int max = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int minOfOdd(int[] mas) {

		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int sum(int[] mas1, int[] mas2) {
		int sum = maxOfEven(mas1) + minOfOdd(mas2);
		return sum;
	}

}
