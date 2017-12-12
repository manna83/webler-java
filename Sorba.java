package hu.webler.tetelek;

import java.util.Random;

public class Sorba {

	public static void main(String[] args) {
		int[] tomb = tombGeneral(40, 10);
		tombKiir(tomb);
		rendezes(tomb);
		tombKiir(tomb);
	}

	private static void rendezes(int[] tomb) {
		int seged = 0;
		for (int i = 0; i < tomb.length; i++) {
			for (int j = i + 1; j < tomb.length; j++) {
				if (tomb[i] > tomb[j]) {
					seged = tomb[i];
					tomb[i] = tomb[j];
					tomb[j] = seged;
				}
			}

		}
	}

	private static int[] tombGeneral(int elemszam, int limit) {
		int[] tomb = new int[elemszam];
		Random veletlen = new Random();
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlen.nextInt(limit) + 1;

		}

		return tomb;
	}

	private static void tombKiir(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
			System.out.print(tomb[i] + ", ");
		}
		System.out.println();
	}
}
