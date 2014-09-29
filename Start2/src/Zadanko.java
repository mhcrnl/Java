import java.util.Scanner;

public class Zadanko {

	private static Scanner odczyt;

	public static void main(String[] args) {
		System.out.println ("Podaj pierwsz¹ zmienn¹: ");
		Double jeden;
		odczyt = new Scanner(System.in);
		jeden = odczyt.nextDouble();
		System.out.println ("Podaj druga zmienn¹: ");
		Double dwa;
		odczyt = new Scanner(System.in);
		dwa = odczyt.nextDouble();
		Double dodawanie = jeden + dwa;
		Double odejmowanie = jeden - dwa;
		Double mnozenie = jeden * dwa;
		Double dzielenie = jeden / dwa;
		System.out.println ("Wynik dodawania: "+dodawanie);
		System.out.println ("Wynik odejmowania: "+odejmowanie);
		System.out.println ("Wynik mno¿enia: "+mnozenie);
		System.out.println ("Wynik dzielenia: "+dzielenie);
		

	}

}
