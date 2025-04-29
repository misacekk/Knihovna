package knihovna;

import java.util.Scanner;

public class Publikace {
    public String nazev;
    public String autor;
    public int rokVydani;
    public String isbn;
    public int pocetStranek;

Scanner sc = new Scanner(System.in);

    public Publikace() {
        System.out.println("Zadej nazev");
        this.nazev = sc.nextLine();
        System.out.println("Zadej autora");
        this.autor = sc.nextLine();
        System.out.println("Zadej rok vydani");
        this.rokVydani =  sc.nextInt();
        sc.nextLine();
        System.out.println("Zadej isbn");
        this.isbn = sc.nextLine();
        System.out.println("Zadej pocet stranek");
        this.pocetStranek =  sc.nextInt();
        sc.nextLine();
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

