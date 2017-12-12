package hu.webler.tetelek;

import java.util.Random;

public class KIvalogatasTetele {

	public static void main(String[] args) {
		int tomb[] = tombGeneral(10, 10);
		tombKiir(tomb);
		kivalogat(tomb);
		tombKiir(kivalogat(tomb));
	}

	private static int[] kivalogat(int[] tomb) {
		int j = 0;

		int parosakszama = 0;

		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				parosakszama++;
			}
		}
		j = 0;
		int[] parosak = new int[parosakszama];
		for (int k1 = 0; k1 < tomb.length; k1++) {
			if (tomb[k1] % 2 == 0) {
				parosak[j] = tomb[k1];
				j++;
			}

		}
		return parosak;
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
