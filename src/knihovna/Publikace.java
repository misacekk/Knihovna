package knihovna;

public class Publikace {
    public String nazev;
    public String autor;
    public int rokVydani;
    public String isbn;
    public int pocetStranek;



    public Publikace(String nazev, String autor, int rokVydani, String isbn, int pocetStranek) {
        this.nazev = nazev;
        this.autor = autor;
        this.rokVydani = rokVydani;
        this.isbn = isbn;
        this.pocetStranek = 0;
    }

    public void vypisInfo(){
        System.out.println("Nazev: " + nazev);
        System.out.println("Autor: " + autor);
        System.out.println("Rok Vydani: " + rokVydani);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pocet Stranek: " + pocetStranek);
    }

    public String getNazev() {
        return nazev;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public int getPocetStranek() {
        return pocetStranek;
    }

    public String getIsbn() {
        return isbn;
    }

}

