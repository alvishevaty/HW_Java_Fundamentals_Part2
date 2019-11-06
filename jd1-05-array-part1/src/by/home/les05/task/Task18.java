package by.home.les05.task;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {

		/*
		 * 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в
		 * рад ячеек, в которые надо вставить игральные кубики. Но дверь открывается
		 * только в том случае, когда в любых трех соседних ячейках сумма точек на
		 * передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1
		 * до 6 точек). Напишите программу, которая разгадывает код замка при условии,
		 * что два кубика уже вставлены в ячейки.
		 */

		int index1 = scanIndex("индекс 1");
		int index2 = scanIndex("индекс 2");

		int el1 = scanElem("значение для индекса 1");
		int el2 = scanElem("значение для индекса 2");

		// System.out.println(index1);
		// System.out.println(index2);

		int[] mas = array(index1, index2, el1, el2);

		PrintArray.print(mas);

		openTheDoor(mas, index1, index2, el1, el2);

	}

	public static int scanIndex(String n) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + n + " в диапазоне от 0 до 9: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите " + n + " в диапазоне от 0 до 9: ");
		}
		int m = sc.nextInt();

		return m;
	}

	public static int scanElem(String n) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + n + " в диапазоне от 1 до 6: ");

		while (sc.hasNextInt() == false) {
			String s = sc.next();
			System.out.print("Введите " + n + " в диапазоне от 1 до 6: ");
		}
		int m = sc.nextInt();

		return m;
	}

	public static int randElement() {
		int i = (int) (Math.random() * 5 + 1);
		return i;
	}

	public static int[] array(int i1, int i2, int el1, int el2) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = randElement();
			array[i1] = el1;
			array[i2] = el2;
		}
		return array;
	}

	public static void openTheDoor(int[] mas, int i1, int i2, int el1, int el2) {
		int r = 0;
		int t = 0;
		for (int i = 0; i < mas.length - 2; i++) {
			r = mas[i] + mas[i + 1] + mas[i + 2];
			if (r == 10) {
				System.out.println("Сейф открыт");
				t++;
				System.out.println("Элементы " + mas[i] + ", " + mas[i + 1] + ", " + mas[i + 2] + " с индексами " + i
						+ ", " + (i + 1) + ", " + (i + 2));
				break;
			}
		}
		if (t == 0) {
			System.out.println("Сейф НЕ открыт");
		}
	}
}
