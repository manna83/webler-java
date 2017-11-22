package hu.webler;

import java.util.Scanner;

public class FindOutTheNumber {
	public int secret; // this variable should be private; it is left public only for testing purpose.

	// keszits ide leirast a fuggvenyrol (lasd lentebb a check fuggveny folott)
	public static void handle() {
		
		FindOutTheNumber test; // inicializald (hozz letre peldanyt)
		test = new FindOutTheNumber();
		
		// ird ki a kimenetre: Gondoltam egy 100-nal kisebb szamra. Talald ki!
		System.out.println("Gondoltam egy 100-nal kisebb szamra. Talald ki!");
		boolean catched = false;
		String result;
		Scanner in= new Scanner(System.in);
		while(!catched) {
			result = test.check(in.nextInt());

			// ird ki a result erteket a kimenetre
			System.out.println("Eredmény: "+result);
			// ha a result erteke "BINGO", a catched kapcsolot allitsd at, hogy a while ciklus erjen veget
			// FIGYELEM!!!: string-ek osszehasonlitasara az .equals() fuggvenyt hasznald, ne a == operatort
			if (result.equals("BINGO")){
				catched=true;
			}
			}
		// zard le az in scannert
		in.close();
	}

	/**
	 * Initializes the number to guess with a random value between 0 and 100.
	 */
	public FindOutTheNumber() {
		secret = (int) Math.round(Math.random() * 100);
	}

	/**
	 * Returns "kisebb" if the guessed number is smaller than the secret.
	 * Returns "nagyobb" if the guessed number is bigger than the secret.
	 * Returns "BINGO" if matches.
	 *
	 * @param number number guessed by the user
	 * @return       kisebb, nagyobb, or BINGÃ“
	 */
	public String check(int number) {
		// ...
		String x;
		if (number < secret) {
			x = "kisebb";
		}else if(number > secret) {
			x = "nagyobb";
		}else {
			x = "BINGO";
		}
		return x;
	}
}
