package hu.webler.tetelek;

import java.util.Random;

public class EldontesTestele {

	public static void main(String[] args) {

		int[] tomb = tombGeneral(10, 100);
		tombKiir(tomb);
		System.out.println(eldont(tomb, 10));

	}

	private static boolean eldont(int[] tomb, int szam) {
		int i = 0;
		boolean eredmeny = false;
		while ((eredmeny == false) && (i < tomb.length)) {
			if (tomb[i] == szam) {
				eredmeny = true;
			} else {
				i++;
			}
		}
		return eredmeny;
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
