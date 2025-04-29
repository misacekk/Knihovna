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
        System.out.println("Nazev: " + nazev);
        System.out.println("Autor: " + autor);
        System.out.println("Rok Vydani: " + rokVydani);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pocet Stranek: " + pocetStranek);
        System.out.println("Predmet: " + predmet);
    }

    public String getPredmet() {
        return predmet;
    }
}

