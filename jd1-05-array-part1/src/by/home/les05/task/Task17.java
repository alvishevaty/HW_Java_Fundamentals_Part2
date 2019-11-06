package by.home.les05.task;

public class Task17 {

	public static void main(String[] args) {

		/*
		 * 17. Дана последовательность целых чисел (a1,a2,...an). Образовать новую
		 * последовательность, выбросив из исходной те члены, которые равны
		 * min(a1,a2,...an).
		 */

		int N = randLen();

		int[] mas = array(N);
		int min = findMin(mas);
		int[] array = newArray(mas, newArrayLen(mas, min), min);

		PrintArray.print(mas);
		System.out.println("Минимальное значение из массива: " + min);
		PrintArray.print(array);

	}

	public static int randLen() {

		int a = (int) (Math.random() * 50 + 10);
		return a;
	}

	public static int randNum() {

		int a = (int) (Math.random() * 100 + 1);
		return a;
	}

	public static int[] array(int a) {

		int[] mas = new int[a];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;
	}

	public static int findMin(int[] a) {
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (b > a[i]) {
				b = a[i];
			}
		}
		return b;
	}

	public static int newArrayLen(int[] a, int b) {

		int j = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				j++;
			}
		}
		return j;
	}

	public static int[] newArray(int[] a, int j, int b) {

		int[] mas = new int[a.length - j];
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b) {
				mas[k] = a[i];
				k++;
			}
		}
		return mas;
	}

}
