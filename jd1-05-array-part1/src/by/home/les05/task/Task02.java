package by.home.les05.task;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив
		 * из номеров этих элементов.
		 */

		int[] mas = new int[] { 0, 1, 5, 4, 2, 0, 8, 9, 12, 0, 4, 6, 7 };
		int[] arrayZero = array(mas);

		PrintArray.print(arrayZero);

	}

	public static int count(int[] mas) {
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				j++;
			}
		}
		return j;
	}

	public static int[] array(int[] mas) {
		int j = 0;
		int[] arrayZero = new int[count(mas)];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				arrayZero[j] = i;
				j++;
			}
		}
		return arrayZero;
	}
}
