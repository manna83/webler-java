package hu.webler.tetelek;

import java.util.Random;

public class SzetValogatasTetele {

	public static void main(String[] args) {
		int tomb[] = tombGeneral(10, 10);
		tombKiir(tomb);
		szetvalogat(tomb);
		
	}

	private static void szetvalogat(int[] tomb) {
		int j = 0; 
		int l = 0;
		int parosakszama = 0;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				parosakszama++;
			}
		}
		
		int[] parosak = new int[parosakszama];
		int[] paratlanok = new int[tomb.length - parosakszama];
		for (int k = 0; k < tomb.length; k++) {
			if (tomb[k] % 2 == 0) {
				parosak[j] = tomb[k];
				j++;
			} else {
				paratlanok[l] = tomb[k];
				l++;
			}

		}
		tombKiir(parosak);
		tombKiir(paratlanok);
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
