package by.home.les05.task;

public class Task08 {

	public static void main(String[] args) {

		/*
		 * 8. Дан массив действительных чисел, размерность которого N. Подсчитать,
		 * сколько в нем отрицательных, положительных и нулевых элементов.
		 */

		int[] mas = array(randLen());

		PrintArray.print(mas);

		negative(mas);
		positive(mas);
		zero(mas);

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

	public static void negative(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				count++;
			}
		}
		System.out.println("Количество отрицательных элементов: " + count);
	}

	public static void positive(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				count++;
			}
		}
		System.out.println("Количество положительных элементов: " + count);
	}

	public static void zero(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		System.out.println("Количество нулевых элементов: " + count);
	}
}
