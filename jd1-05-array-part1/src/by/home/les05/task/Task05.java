package by.home.les05.task;

public class Task05 {

	public static void main(String[] args) {

		/*
		 * 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив
		 * из четных чисел этой последовательности. Если таких чисел нет, то вывести
		 * сообщение об этом факте.
		 */

		int N = randLen();
		int[] mas = array(N);

		PrintArray.print(mas);
		System.out.println("\n" + "Количество четных чисел в последовательности: " + even(mas) + "\n");
		compare(even(mas), mas);

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

	public static int even(int[] mas) {
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0 & mas[i] != 0) {
				j++;
			}
		}
		return j;
	}

	public static void compare(int a, int[] mas) {
		if (a == 0) {
			System.out.println("Четных чисел нет.");
		} else if (a > 0) {
			arrayEven(mas);
			PrintArray.print(arrayEven(mas));
		}
	}

	public static int[] arrayEven(int[] mas) {
		int[] array = new int[even(mas)];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0 & mas[i] != 0) {
				array[j] = mas[i];
				j++;
			}
		}
		return array;
	}

}
