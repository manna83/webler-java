package hu.webler;

import java.util.Scanner;

public class GuessANumber {
	private int min = 0;
	private int max = 100;
	private int next_tip;

	// javadoc
	public static void handler() {
		GuessANumber finder = new GuessANumber();

		System.out.println("Gondolj egy száznál kisebb számra.");
		Scanner in = new Scanner(System.in);
		String response;
		boolean catched = false;
		while(!catched) {
			System.out.printf("%d? (kisebb/nagyobb/ez az)\n", finder.approximate());
			response = in.nextLine();
			if(response.equals("ez az")) catched = true;
			else finder.approximate(response);
		}
		in.close();
	}

	// javadoc
	public int approximate() { return approximate(""); }

	// javadoc
	// a fuggveny pontositasi utasitas (kisebb/nagyobb) nelkul is meghivhato,
	// ilyenkor csak a tippet adja vissza, de nincs modja pontositani
	// ehhez a fuggvényhez tesztet is kell irni
	public int approximate(String response) {
		// a visszajelzes alapjan (kisebb/nagyobb/ez az) kell varialni a min, max, next_tip ertekekkel
		// és visszaadni a kovetkezo tippet
		next_tip = (max + min)/2;
		
		 if (response.equals("kisebb")) {
			 max = next_tip-1;
		 }else if (response.equals("nagyobb")) {
			 min = next_tip+1;
		 }
		 
		return next_tip;
	}
}
