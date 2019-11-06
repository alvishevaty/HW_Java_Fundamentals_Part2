package by.home.les05.task;

public class Task10 {

	public static void main(String[] args) {

		/*
		 * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		 * которых аi > i.
		 */

		int[] mas = array(randLen());
		int[] array = enumeration(mas);
		
		PrintArray.print(mas);
		PrintArray.print(array);

	}

	public static int randLen() {

		int a = (int) (Math.random() * 10 + 1);
		return a;

	}

	public static int randNum() {

		int a = (int) (Math.random() * 40 - 20);
		return a;

	}

	public static int[] array(int a) {

		int[] mas = new int[a];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;

	}

	public static int enumerationCount(int[] mas) {

		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				j++;
			}
		}
		return j;

	}

	public static int[] enumeration(int[] mas) {

		int[] array = new int[enumerationCount(mas)];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				array[j] = mas[i];
				j++;
			}
		}
		return array;

	}

}
