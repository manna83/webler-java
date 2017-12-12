package hu.webler.tetelek;

import java.util.Random;

public class MaximumKivalasztas {

	public static void main(String[] args) {

		int[] tomb = tombGeneral(5, 100);
		tombKiir(tomb);
		System.out.println("Maximum: " + maxKiv(tomb));

	}

	private static int maxKiv(int[] tomb) {
		int max = tomb[0];
		for (int i = 0; i < tomb.length; i++) {
			if (max < tomb[i]) {
				max = tomb[i];
			}
		}
		return max;
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
