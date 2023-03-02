import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karta> karty = new ArrayList<>(GenerojKarty.generujKarty());
        System.out.println(karty);
    }
}
