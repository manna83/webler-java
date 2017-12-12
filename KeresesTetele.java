package hu.webler.tetelek;

import java.util.Random;

public class KeresesTetele {

	public static void main(String[] args) {

		int[] tomb = tombGeneral(10, 10);
		tombKiir(tomb);
		System.out.println(Keres(tomb, 10));

	}

	private static int Keres(int[] tomb, int szam) {
		int i = 0;
		int hanyadik = -1;
		while ((hanyadik == -1) && (i < tomb.length)) {
			if (tomb[i] == szam) {
				hanyadik = i;
			} else {
				i++;
			}
		}
		return hanyadik;
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
