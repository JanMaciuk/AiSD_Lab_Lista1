import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karta> karty = new ArrayList<>(GenerojKarty.generujKarty());
        printKarty(karty);
        System.out.println("liczba kart:" + policzKarty(karty));
    }
    public static void printKarty(ArrayList<Karta> karty) {
        ListIterator<Karta> iterator  = karty.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().getString());
        }
    }
    public static int policzKarty(ArrayList<Karta> karty) {
        ListIterator<Karta> iterator  = karty.listIterator();
        int i = 0;
        while(iterator.hasNext()) {
            i++;
            iterator.next();
        }
            return i;
        }

}
