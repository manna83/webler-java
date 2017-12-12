package hu.webler.tetelek;

import java.util.Random;

public class MegSzamlalas {

	public static void main(String[] args) {
		int[] tomb = tombGeneral(10, 10);
		tombKiir(tomb);
		System.out.println(megszamlal(tomb, 3) + " darab keresett szám van a tömbben");
	}

	private static int megszamlal(int[] tomb, int szam) {
		int counter = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] == szam) {
				counter++;
			}
		}
		return counter;
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
