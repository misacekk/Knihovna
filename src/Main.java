import knihovna.Roman;
import knihovna.Ucebnice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Roman roman = new Roman("ae","dede",12,"dab",5,"dadada");
        roman.vypisInfo();
        System.out.println("------------------------------------------------");
        Ucebnice ucebnice = new Ucebnice("cau","desse",13,"bdad",85,"caca");
        ucebnice.vypisInfo();

    }
}
