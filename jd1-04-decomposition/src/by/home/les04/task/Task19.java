package by.home.les04.task;

public class Task19 {

	public static void main(String[] args) {

		/*
		 * 19. Написать программу, определяющую сумму n - значных чисел, содержащих
		 * только нечетные цифры. Определить также, сколько четных цифр в найденной
		 * сумме. Для решения задачи использовать декомпозицию.
		 */
		
		int n = rand();
		int[] mas = massive(n, length(n));
		long sum = sum(mas);

		System.out.println("Перебираем все " + n + "-значные числа.");
		printMas(mas);
		System.out.println("Сумма чисел, содержащие только нечетные цифры: " + sum);
		System.out.println("Количество четных цифр: " + even(sum));
	}

	public static int rand() {
		int N = (int) (Math.random() * 2 + 3);
		return N;
	}

	public static int length(int n) {
		int k = 0;
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int l = i;
			int m = n;
			for (; l > 0; l = l / 10) {
				int a = l % 10;
				if (a % 2 != 0) {
					m--;
				}
				if (m == 0) {
					k++;
				}
			}
		}
		return k;
	}

	public static int[] massive(int n, int k) {
		int[] mas = new int[k];
		int j = 0;
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int l = i;
			int m = n;
			for (; l > 0; l = l / 10) {
				int a = l % 10;
				if (a % 2 != 0) {
					m--;
				}
				if (m == 0) {
					mas[j] = i;
					j++;
				}
			}
		}
		return mas;
	}

	public static long sum(int[] mas) {
		long sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum = sum + mas[i];
		}
		return sum;
	}

	public static int even(long sum) {
		int i = 0;
		for (; sum > 0; sum = sum / 10) {
			long a = sum % 10;
			if (a % 2 == 0) {
				i++;
			}
		}
		return i;
	}

	public static void printMas(int[] mas) {
		System.out.print("{");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "; ");
		}
		System.out.println("}");
	}
}
