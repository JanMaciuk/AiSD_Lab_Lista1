import java.util.ArrayList;
import java.util.ListIterator;

public class FilterKart {
    public static ArrayList<Karta> kartyKoloru(ArrayList<Karta> karty, int kolor) {
        ArrayList<Karta> kartyKoloru = new ArrayList<>();
        ListIterator<Karta> iterator  = karty.listIterator();
        while(iterator.hasNext()) {
            Karta sprawdzanaKarta = iterator.next();
            if (sprawdzanaKarta.getKolor() == kolor) {
                kartyKoloru.add(sprawdzanaKarta);
            }
        }
        return kartyKoloru;
    }

    public static ArrayList<Karta> kartyWartosci(ArrayList<Karta> karty, int wartosc) {
        ArrayList<Karta> kartyWartosci = new ArrayList<>();
        ListIterator<Karta> iterator  = karty.listIterator();
        while(iterator.hasNext()) {
            Karta sprawdzanaKarta = iterator.next();
            if (sprawdzanaKarta.getWartosc() == wartosc) {
                kartyWartosci.add(sprawdzanaKarta);
            }
        }
        return kartyWartosci;
    }
    public static void usunPowtorki() {
        Karta poprzednia = Main.karty.get(0);
        Karta nastepna = Main.karty.get(1);
        ListIterator<Karta> iterator  = Main.karty.listIterator();

        while(iterator.hasNext()) {
            poprzednia = iterator.next();
            if (!iterator.hasNext()) break;
            nastepna = iterator.next();
            if (nastepna.getString().equals(poprzednia.getString())) iterator.previous();iterator.remove();
            if (!iterator.hasNext()) break;
            nastepna = iterator.next(); //uwzględniam możliwość, że powtórek jest wiele
            iterator.previous();
            while(iterator.hasNext()&&nastepna.getString().equals(poprzednia.getString())) { //jeżeli jest bardzo dużo powtórek
                iterator.remove();
                nastepna = iterator.next();
                iterator.previous();
            }
        }
        System.out.println("Usunięto powtarzające się karty");
    }
}
