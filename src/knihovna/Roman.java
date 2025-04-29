package knihovna;

public class Roman extends Publikace {
    public String zanr;

    public Roman(String nazev, String autor, int rokVydani, String isbn, int pocetStranek, String zanr) {
        super(nazev, autor, rokVydani, isbn, pocetStranek);
        this.zanr = zanr;
    }

    @Override
    public void vypisInfo(){
        System.out.println("Nazev: " + nazev);
        System.out.println("Autor: " + autor);
        System.out.println("Rok Vydani: " + rokVydani);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pocet Stranek: " + pocetStranek);
        System.out.println("Zanr: " + zanr);
    }

}

