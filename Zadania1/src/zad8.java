import java.util.Scanner;

public class zad8 {

	private static Scanner odczyt;
	private static int a,b,c;
	
	public static void main(String[] args) {
		System.out.println ("Podaj 1 odcinek: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj 2 odcinek: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj 3 odcinek: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		if (((a^2+b^2-c^2)*(a^2+c^2-b^2)*(b^2+c^2-a^2))==0)
			System.out.println ("Jest to tr�jk�t prostok�tny");
		else
			System.out.println ("Nie jest to tr�jk�t prostok�tny");
	}

}