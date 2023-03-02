import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public class GenerojKarty {

    public static ArrayList<Karta> generujKarty() {

        //Tworzę pierwszą kartę
        ArrayList<Karta> karty = new ArrayList<>();
        int wartosc = ThreadLocalRandom.current().nextInt(1, 13);
        int kolor = ThreadLocalRandom.current().nextInt(0, 3);
        karty.add(new Karta(wartosc, kolor));

    while(true) {
        wartosc = ThreadLocalRandom.current().nextInt(0, 13);
        if (wartosc == 0) {break;}
        kolor = ThreadLocalRandom.current().nextInt(0, 3);
        ListIterator<Karta> iterator  = karty.listIterator();

        while(true) { // dodawanie iteratorem
            if (!iterator.hasNext()) {iterator.add(new Karta(wartosc, kolor)); break;} // Jeżeli jestem na końcu listy, to dodaje tutaj.
            Karta nastepna = iterator.next();
            iterator.previous(); // cofam o jedno, bo pobranie wartości następnej karty przesunęło iterator
            if (nastepna.getWartosc() < wartosc) {iterator.add(new Karta(wartosc,kolor)); break;}
            if (nastepna.getWartosc() == wartosc && nastepna.getKolor() < kolor) {iterator.next(); continue;}
            if (nastepna.getWartosc() == wartosc && nastepna.getKolor() >= kolor) { iterator.add(new Karta(wartosc, kolor)); break;}
            if (nastepna.getWartosc() > wartosc) {iterator.next();}
        }

    }

        return karty;
    }
}
