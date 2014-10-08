import java.util.Scanner;

public class Zad4 {

	private static Scanner odczyt;
	public static int a,b,x;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe a: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe b: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		if ( a!=0 && b!=0 ){
			
		}
		else if ( a==0 && b!=0 )
			System.out.println ("Brak rozwi¹zañ");
		else if ( a==0 && b==0 )
			System.out.println ("Nie wymierna");
	}

}