import java.util.Scanner;

public class Zad2 {

	private static Scanner odczyt;
	public static int a,b;

	public static void main(String[] args) {
		System.out.println ("Podaj ocen�: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		switch(a){
		case 1:{
			System.out.println ("Niedostateczna");
			break;
		}
		case 2:{
			System.out.println ("Dopuszczaj�ca");
			break;
		}
		case 3:{
			System.out.println ("Dostateczna");
			break;
		}
		case 4:{
			System.out.println ("Dobra");
			break;
		}
		case 5:{
			System.out.println ("Bardzo dobra");
			break;
		}
		case 6:{
			System.out.println ("Celuj�ca");
			break;
		}
			
		}

	}

}