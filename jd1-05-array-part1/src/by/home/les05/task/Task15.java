package by.home.les05.task;

public class Task15 {

	public static void main(String[] args) {

		/*
		 * 15. Дана последовательность действительных чисел n (a1 ,a2 ,... ,an) . Указать
		 * те ее элементы, которые принадлежат отрезку [с, d].
		 */
		
		int N = randLen();
		int c = randNum();
		int d = randRange(c);
		int[] mas = array(N);
		
		
		PrintArray.print(mas);
		System.out.println("[" + c + " ; " + d + "]");
		newArray(mas, c , d);
		
		
	}
	
	public static int randLen() {

		int a = (int) (Math.random() * 50 + 10);
		return a;

	}

	public static int randNum() {

		int a = (int) (Math.random() * 100 + 1);
		return a;

	}

	public static int randRange(int N) {

		int k = (int) (Math.random() * 100 + 10);

		while (k < N) {
			k = (int) (Math.random() * 100 + 10);
		}
		return k;

	}
	
	public static int[] array(int a) {

		int[] mas = new int[a];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = randNum();
		}
		return mas;
	}
	
	public static int newArrayLen(int[] a, int c, int d) {

		int j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= c & a[i] <= d) {
				j++;
			}
		}
		return j;
	}
	
	public static void newArray(int[] a, int c, int d) {

		if (newArrayLen(a, c, d) == 0) {
			System.out.println("Таких чисел нет.");
		}
		else {
			int[] b = new int[newArrayLen(a, c, d)];
			int j = 0;
			
			for (int i = 0; i < a.length; i++) {
				if (a[i] >= c & a[i] <= d) {
					b[j] = a[i];
					j++;
				}
			}
			PrintArray.print(b);
		}
	}
}