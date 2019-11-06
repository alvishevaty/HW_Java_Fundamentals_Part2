package by.home.les05.task;

public class Task03 {

	public static void main(String[] args) {

		/*
		 * 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
		 * встречается раньше - положительное или отрицательное.
		 */

		int N = randLen();
		int[] mas = array(N);

		PrintArray.print(mas);
		minusOrPlus(mas);

	}

	public static int randLen() {
		int a = (int) (Math.random() * 100 + 1);
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

	public static void minusOrPlus(int[] mas) {
		if (mas[0] > 0) {
			System.out.println("Раньше встречается положительное число.");
		} else if (mas[0] < 0) {
			System.out.println("Раньше встречается отрицательное число.");
		} else if (mas[0] == 0) {
			System.out.println("Первое число равно 0.");
		}
	}

}
