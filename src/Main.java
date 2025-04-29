import knihovna.Roman;
import knihovna.Ucebnice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Roman> roman = new ArrayList<Roman>();

        System.out.println("------------------------------------------------");
        ArrayList<Ucebnice> ucebnice = new ArrayList<Ucebnice>();


        System.out.println("Zadej pocet romanu");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Roman c" +(i+1));
            roman.add(new Roman());
        }

        System.out.println("Zadej pocet ucebnic");
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            System.out.println("Ucebnice c" +(i+1));
            ucebnice.add(new Ucebnice());
        }

        int str=0;
        for (Ucebnice u : ucebnice) {
            str += u.getPocetStranek();
        }
        System.out.println("Celkovy pocet stranek"+str);

    }
}
