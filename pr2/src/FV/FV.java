package FV;
import java.util.Scanner;

public class FV {
	//FV fv =new FV();
	public double fv1_atl(double a,double b){
		return (a+b)/2;
	}
	
	int a2=1;
	int b2=2;
	int c2=3;
	public int fv2(int x){
		return x*x*a2+x*b2+c2;
	}
	
	public double fv3_atf(int a,int b){
		return Math.sqrt(a*a+b*b);
	}
	
	public double fv3_T(int a, int b){
		return (a*b)/2;
	}
	
	public double fv3_K(int a, int b){
		return a+b+fv3_atf(a,b);
	}
	
	private static double eur_arf = 400;
	public static double fv4_HUFtoEUR(int a){
		return a/eur_arf;
	}
	public static double fv4_EURtoHUF(int a){
		return a*eur_arf;
	}
	
	private static double kamatlab = 10;
	public  static double fv5_kamatoskamat(int a){
		return a+(a*kamatlab/100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FV fv = new FV();
		Scanner in = new Scanner(System.in);
		System.out.println("Bemeneti értékek: ");
		/*int x=in.nextInt();
		int y=in.nextInt();
		
		System.out.println("Átlag: " + fv.fv1_atl(x,y));
		
		System.out.println("f(x)= " + fv.fv2(y));
		
		System.out.println("Derékszögû háromszög befogói: "+x+" és "+y);
		System.out.println("Átfogó: "+fv.fv3_atf(x, y));
		System.out.println("Kerület: "+fv.fv3_K(x, y));
		System.out.println("Terület: "+fv.fv3_T(x, y));
		
		System.out.println("EUR árfolyam:"+eur_arf);
		System.out.println(x+" EUR= "+ fv4_EURtoHUF(x) + " HUF");
		y = y * 1000;
		System.out.println(y+" HUF= "+ fv4_HUFtoEUR(y) + " EUR");*/
		 
		System.out.println("Adj meg egy összeget!");
		int ossz = in.nextInt();
		System.out.println(ossz + " Ft kamatos kamatja "+kamatlab+"%-os kamatlábbal: "+ fv5_kamatoskamat(ossz) + " Ft");
		
		in.close();
		
	}

}
