package by.home.les05.task;

public class Task11 {

	public static void main(String[] args) {

		/*
		 * 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
		 * остаток от деления на М равен L (0 < L < М-1).
		 */

		int[] mas = array(randLen());
		
		PrintArray.print(mas);
		
		int M = randLen();	
		System.out.println("Число, на которое делим: " + M);
		
		int L = randL(M);
		System.out.println("Остаток от деления: " + L);

		newArray(mas, M, L);

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

	public static int randL(int m) {

		int l = (int) (Math.random() * 100 - 10);

		while (l < 0 | l > m - 1) {
			l = (int) (Math.random() * 100 - 10);
		}

		return l;

	}

	public static int newArrayLen(int[] mas, int M, int L) {

		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % M == L) {
				j++;
			}
		}
		return j;

	}

	public static void newArray(int[] mas, int M, int L) {

		if(newArrayLen(mas, M, L) == 0) {
			System.out.println("Таких чисел нет.");
		} else {
			int[] array = new int[newArrayLen(mas, M, L)];
			int j = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % M == L) {
					array[j] = mas[i];
					j++;
				}
			}
			PrintArray.print(array);
		}
		

	}

}
