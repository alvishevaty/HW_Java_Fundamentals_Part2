package by.home.les05.task;

public class Task12 {

	public static void main(String[] args) {

		/*
		 * 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		 * порядковые номера которых являются простыми числами.
		 */

		int[] mas = array(randNum());
		int[] array = newArray(mas);
		
		PrintArray.print(mas);

		System.out.println(newArrayLen(mas));
		
		PrintArray.print(array);

		System.out.println("Искомая сумма: " + sum(array));

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

	public static int newArrayLen(int[] mas) {
		int k = 0;
		int l = 0;
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k++;
				}
			}
			if (k == 2 || k == 1) {
				l++;
			}
			k = 0;

		}
		return l + 1;
	}

	public static int[] newArray(int[] mas) {
		
		int[] array = new int[newArrayLen(mas)];
		int k = 0;
		int l = 2;
		
		for (int i = 2; i < mas.length; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k++;
				}
			}
			
			array[0] = mas[0];
			array[1] = mas[1];
			
			if (k == 2 || k == 1) {
				array[l] = mas[i];
				l++;
			}
			k = 0;
		}
		return array;
	}

	public static int sum(int[] mas) {
		int sum = 0;
		
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		
		return sum;
	}

}
