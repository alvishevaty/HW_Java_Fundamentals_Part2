package by.home.les05.task;

public class Task09 {

	public static void main(String[] args) {

		/*
		 * 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
		 * наименьший элементы.
		 */

		int[] mas = array(randLen());

		PrintArray.print(mas);
		
		PrintArray.print(newArray(mas));

	}

	public static int randLen() {
		int a = (int) (Math.random() * 10 + 1);
		return a;
	}

	public static int randNum() {
		int a = (int) (Math.random() * 100 - 50);
		return a;
	}

	public static int[] array(int a) {
		int[] mas = new int[a];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;
	}

	public static int min(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int max(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int minIndex(int[] mas) {
		int min = mas[0];
		int index = 0;
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
				index = i;
			}
		}
		return index;
	}

	public static int maxIndex(int[] mas) {
		int max = mas[0];
		int index = 0;
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				index = i;
			}
		}
		return index;
	}

	public static int[] newArray(int[] mas) {
		int[] array = mas;
		int a = min(mas);
		int b = max(mas);
		int j = minIndex(mas);
		int i = maxIndex(mas);
		array[i] = a;
		array[j] = b;
		return array;
	}
}
