package hu.webler.tetelek;

import java.util.Random;

public class OsszegzesTetele {

	public static void main(String[] args) {
		int[] tomb = tombGeneral(10,100);
		tombKiir(tomb);
		System.out.println("A tömb összege = " + Osszegzes(tomb));
		
		
	}

	private static int Osszegzes(int[] tomb) {
		int osszeg = 0;
		for (int i = 0; i < tomb.length; i++) {
			osszeg+=tomb[i];
		}
		return osszeg;
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

