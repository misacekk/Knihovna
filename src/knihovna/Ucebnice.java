package knihovna;

public class Ucebnice extends Publikace {
    public String predmet;
    public Ucebnice(String nazev, String autor, int rokVydani, String isbn, int pocetStranek, String predmet) {
        super(nazev, autor, rokVydani, isbn, pocetStranek);
        this.predmet = predmet;
    }

    @Override
    public void vypisInfo(){
        System.out.println("Nazev: " + nazev);
        System.out.println("Autor: " + autor);
        System.out.println("Rok Vydani: " + rokVydani);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pocet Stranek: " + pocetStranek);
        System.out.println("Predmet: " + predmet);
    }

}

