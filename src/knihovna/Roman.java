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
        System.out.println("Nazev: " + getNazev());
        System.out.println("Autor: " + getAutor());
        System.out.println("Rok Vydani: " + getRokVydani());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Pocet Stranek: " + getPocetStranek());
        System.out.println("Zanr: " + zanr);
    }

}

