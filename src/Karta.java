public class Karta {

    protected int Wartosc;
    protected int Kolor;

    public Karta(int Wartosc, int Kolor) {
        this.Wartosc = Wartosc;
        this.Kolor = Kolor;
    }

    public int getWartosc() {
        return Wartosc;
    }

    public int getKolor() {
        return Kolor;
    }

    public String getString() {
        String kolor = Integer.toString(Kolor);
        String wartosc = Integer.toString(Wartosc);
        switch (Kolor) {
            case 0: kolor = "Kier"; break;
            case 1: kolor = "Karo"; break;
            case 2: kolor = "Trefl"; break;
            case 3: kolor = "Pik"; break;
        }
        switch (Wartosc) {
            case 1: wartosc = "As"; break;
            case 11: wartosc = "Walet"; break;
            case 12: wartosc = "Dama"; break;
            case 13: wartosc = "Król"; break;
        }
        return wartosc + " " + kolor;

    }
}
