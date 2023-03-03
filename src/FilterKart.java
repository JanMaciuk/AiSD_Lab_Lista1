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
}
