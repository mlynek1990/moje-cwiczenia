package librus;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Uczen uczen = new Uczen();
    	Dziennik dziennik = new Dziennik();
    	while(true) {
    		System.out.println("Wybierz opcje: ");
    		System.out.println("1. Dodaj ucznia");
    		System.out.println("2. Usun ucznia");
    		System.out.println("3. Wyswietl uczniow");
    		System.out.println("4. Dodaj ocene");
    		System.out.println("5. Usun ocene");
    		System.out.println("6. Wyswietl oceny");
    		System.out.println("7. Wyjdz");
    		int wybor = scanner.nextInt();
    		switch(wybor) {
    		case 1 : dziennik.dodawanieUcznia();
    			break;
    		case 2 : dziennik.usuwanieUcznia();
    			break;
    		case 3 : dziennik.wyswietlUczniow();
    			break;
    		case 4 : 
    			System.out.println("Wybierz przedmiot: ");
    			System.out.println("1.Matematka");
    			System.out.println("2. Polski");
    			System.out.println("3. Historia");
    			System.out.println("4. Przyroda");
    			int wybor2 = scanner.nextInt();
    			switch(wybor2) {
    			case 1 :
    				System.out.println("Wybierz ucznia");
    				dziennik.wyswietlUczniow();
    				System.out.println("Wpisz numer ucznia");
    				dziennik.wybierzUcznia(scanner.nextInt()).dodawanieOcenyMatematyka();
    				break;
    			case 2 :
    				System.out.println("Wybierz ucznia");
    				dziennik.wyswietlUczniow();
    				System.out.println("Wpisz numer ucznia");
    				dziennik.wybierzUcznia(scanner.nextInt()).dodawanieOcenyPolski();
    				break;
    			case 3 :
    				System.out.println("Wybierz ucznia");
    				dziennik.wyswietlUczniow();
    				System.out.println("Wpisz numer ucznia");
    				dziennik.wybierzUcznia(scanner.nextInt()).dodawanieOcenyHistoria();
    				break;
    			case 4 :
    				System.out.println("Wybierz ucznia");
    				dziennik.wyswietlUczniow();
    				System.out.println("Wpisz numer ucznia");
    				dziennik.wybierzUcznia(scanner.nextInt()).dodawanieOcenyPrzyrka();
    				break;
    			} break;
    		case 5 : 
    			System.out.println("Wybierz ucznia");
    			dziennik.wyswietlUczniow();
    			System.out.println("Wpisz numer ucznia");
    			dziennik.wybierzUcznia(scanner.nextInt()).usuwanieOcen();
    			break;
    		case 6 : 
    			System.out.println("Wybierz ucznia");
    			dziennik.wyswietlUczniow();
    			System.out.println("Wpisz nr ucznia");
    			dziennik.wybierzUcznia(scanner.nextInt()).wyswietlanieOcen();
    			break;
    		case 7 :
    			System.out.println("koniec");
    			break;
    		}
    	}
    }
}