package by.home.les05.task;

public class Task07 {

	public static void main(String[] args) {

		/*
		 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
		 * ее члены, большие данного Z, этим числом. Подсчитать количество замен.
		 */

		int Z = randNum();
		int[] mas = array(randLen());

		System.out.println("Сравниваемое значение: " + Z + "\n");
		PrintArray.print(mas);
		PrintArray.print(compare(mas, Z));

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

	public static int[] compare(int[] mas, int Z) {
		int[] array = mas;
		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > Z) {
				array[i] = Z;
				y++;
			}
		}
		System.out.println("Количество замен: " + y);
		return array;
	}

}
