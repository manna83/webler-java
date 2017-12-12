package hu.webler.tetelek;

import java.util.Random;

public class Metszet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tomb1[] = tombGeneral(15, 50);
		int tomb2[] = tombGeneral(15, 50);
		tombKiir(tomb1);
		tombKiir(tomb2);
		
		int count = 0;
		//int j=0;
		for (int i = 0; i < tomb1.length; i++) {
			 
				if(tomb1[i]==tomb2[count]) {
					count++;
				}
			
		}
		System.out.println(count);
		int tombMetszet[] = new int[count];
		int m=0;
		
		for (int i = 0; i < tomb1.length; i++) {
			/*for (int j = 0; j < tomb2.length; j++) {
				if(tomb1[i]==tomb2[j]) {
					tombMetszet[m]=tomb1[i];
					m++;
					j=tomb2.length; //talált, akkor ugorjunk
				}
			}*/
			if (eldont(tomb1[i],tomb2) && (m<count)) {
				tombMetszet[m]=tomb1[i];
				m++;
			}
		}
		
		tombKiir(tombMetszet);
		
	}
		
	

	public static boolean eldont(int szam, int[] tomb){
		boolean bennevan=false;
		
		int i=0;
		while((i<tomb.length) && (bennevan==false)) {
			if(szam==tomb[i]) {
				bennevan=true;
			}
			i++;
		}
		
		return bennevan;
	}
	
	private static int[] tombGeneral(int elemszam, int limit) {
		int[] tomb = new int[elemszam];
		Random veletlen = new Random();
		tomb[0] = veletlen.nextInt(limit);
		
		int velszam;
		for (int i = 1; i < tomb.length; i++) {
			
			do {
				velszam = veletlen.nextInt(limit);
			} while (eldont(velszam,tomb));
			
			tomb[i]=velszam;
		} 
		
		return tomb;
	}
	
	private static void tombKiir(int[] tomb) {
		for (int i = 0; i < tomb.length; i++) {
		 
			if(i==tomb.length-1) {
				System.out.print(tomb[i]);
			}else {
				System.out.print(tomb[i] + ", ");
			}
		}
		System.out.println();
	}

}
