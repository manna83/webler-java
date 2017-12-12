package hu.webler.tetelek;

import java.util.Random;

public class Szetvalogatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tomb[] = tombGeneral(20, 20);
		tombKiir(tomb);
		
		//int psm=0;
		int ptlm=0;
		
		for (int i = 0; i < tomb.length; i++) {			
				if (tomb[i]%2==1) {					
					//ptl[ptlm]=tomb[i];	
					ptlm++;
				}/*else {
					//ps[psm]=tomb[i];
					psm++;
				}	*/
		}
		
		
		int ptl[] = new int[ptlm];
		int ps[] = new int[tomb.length-ptlm];
		
		int psm=0;
		ptlm=0;
		for (int i = 0; i < tomb.length; i++) {			
			if (tomb[i]%2==1) {					
				ptl[ptlm]=tomb[i];	
				ptlm++;
			}else {
				ps[psm]=tomb[i];
				psm++;
			}	
	}
		
			
		System.out.println("Ps/Ptl: ");
		tombKiir(ps);
		tombKiir(ptl);
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
		 
			if(i==tomb.length-1) {
				System.out.print(tomb[i]);
			}else {
				System.out.print(tomb[i] + ", ");
			}
		}
		System.out.println();
	}
}
