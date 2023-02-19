package librus;

import java.util.*;
public class Dziennik {
    private List <Uczen> listaUczniow = new ArrayList<>();

public void dodawanieUcznia(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj imie: ");
    String imie = scanner.nextLine();
    System.out.println("Podaj nazwisko: ");
    String nazwisko = scanner.nextLine();
    Uczen uczen = new Uczen(imie, nazwisko);
    listaUczniow.add(uczen);
}
public void usuwanieUcznia() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ktorego ucznia chcesz usunac?");
	wyswietlUczniow();
	listaUczniow.remove(scanner.nextInt());
	
}
public Uczen wybierzUcznia(int numer) {
	return listaUczniow.get(numer);
}
public void wyswietlUczniow() {
	int licznik = 0;
	for (Uczen uczen : listaUczniow) {
		System.out.print(licznik+". ");
		uczen.wyswietlUcznia();
		licznik++;
		System.out.println("");
		
	}
}
}
