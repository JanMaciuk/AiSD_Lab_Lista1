import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    protected static ArrayList<Karta> karty = new ArrayList<>(); // lista kart
    public static void main(String[] args) {
        menu();

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

        public static void menu() {
            Scanner scanner = new Scanner(System.in);
            boolean run = true;
            int wybor;
            while (run) {
                System.out.println("""
                    0 - wyjdź\s
                    1 - utwórz listę kart\s
                    2 - wyświetl karty\s
                    3 - Policz karty\s
                    4 - wyświetl karty o podanej wartości\s
                    5 - wyświetl karty o podanym kolorze\s
                    6 - usuń powtarzające się karty\s""");
                wybor = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (wybor) {
                        case 0 -> run = false;
                        case 1 -> karty = GenerojKarty.generujKarty();
                        case 2 -> printKarty(karty);
                        case 3 -> System.out.println("liczba kart:" + policzKarty(karty));
                        case 4 ->
                            //TODO
                                System.out.println("wyświetl karty o podanej wartości");
                        case 5 ->
                            //TODO
                                System.out.println("wyświetl karty o podanym kolorze");
                        case 6 ->
                            //TODO
                                System.out.println("usuń powtarzające się karty");
                    }
                }
                catch ( java.util.InputMismatchException | java.lang.NumberFormatException e) {
                    System.out.println("Wpisałeś błędny typ danych!");
                    scanner.nextLine();
                }
        }}
}
