package knihovna;

public class Roman extends Publikace {
    public String zanr;

    public Roman() {
        super();
        System.out.println("Zadej zanr");
        this.zanr = sc.nextLine();
    }

    public String getZanr() {
        return zanr;
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

