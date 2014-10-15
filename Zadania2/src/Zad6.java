import java.util.Scanner;

public class Zad6 {

	private static Scanner odczyt;
	public static int a,b,c,x0,x1,x2,d;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe a: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe b: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj liczbe c: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		d = b*b+4*a*c;
		if ( d>0 ){
			x1 = 0;
		}
		else if ( d==0 ){
			
		}
		else
			System.out.println ("Brak rozwi¹zañ");
	}

}