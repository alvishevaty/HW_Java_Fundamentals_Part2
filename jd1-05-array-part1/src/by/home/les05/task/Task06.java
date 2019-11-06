package by.home.les05.task;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		 * числовой оси, содержащую все эти числа.
		 */

		int[] mas = array(randLen());

		PrintArray.print(mas);

		System.out.println("Минимальное число из последовательности: " + min(mas));
		System.out.println("Максимальное число из последовательности: " + max(mas));
		System.out.println("Наименьшая длина числовой оси: " + lengthOfSequence(min(mas), max(mas)));
	}

	public static int randLen() {
		int a = (int) (Math.random() * 20 + 1);
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

	public static int min(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i])
				min = mas[i];
		}
		return min;
	}

	public static int max(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i])
				max = mas[i];
		}
		return max;
	}

	public static int lengthOfSequence(int min, int max) {
		int l = max - min + 1;
		return l;
	}
}
