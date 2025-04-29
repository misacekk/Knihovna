package knihovna;

public class Ucebnice extends Publikace {
    public String predmet;
    public Ucebnice() {
        super();
        System.out.println("Zadej predmet");
        this.predmet = sc.nextLine();
    }

    @Override
    public void vypisInfo(){
        System.out.println("Nazev: " + getNazev());
        System.out.println("Autor: " + getAutor());
        System.out.println("Rok Vydani: " + getRokVydani());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Pocet Stranek: " + getPocetStranek());
        System.out.println("Predmet: " + predmet);
    }

    public String getPredmet() {
        return predmet;
    }
}

