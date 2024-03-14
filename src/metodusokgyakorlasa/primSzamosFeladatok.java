package metodusokgyakorlasa;

import java.util.Random;

public class primSzamosFeladatok {

    static Random rnd = new Random();

    public static void main(String[] args) {
        parPrimEldontesKiirasa();
    }

    private static void parPrimEldontesKiirasa() {
        kiiras(vaneBennePrim(listaLetrehozas()));
        System.out.println("");
        kiiras(mindegyikPrimE(listaLetrehozas()));
        System.out.println("");
        kiiras(legnagyobbPrimszam(listaLetrehozas()));
    }

    private static void kiiras(boolean ertek) {
        System.out.print(ertek);
    }

    private static void kiiras(int ertek) {
        System.out.println(ertek);
    }

    private static boolean vaneBennePrim(int[] szamLista) {
        boolean vanPrim = true;
        int i = 0;
        while (i < szamLista.length && !primSzam(szamLista[i])) {
            i++;
        }
        if (i < szamLista.length) {
            vanPrim = true;
        } else {
            vanPrim = false;
        }
        return vanPrim;
    }

    private static boolean mindegyikPrimE(int[] szamLista) {
        boolean mindPrim = true;
        int i = 0;
        while (i < szamLista.length && primSzam(szamLista[i])) {
            i++;
        }
        if (i < szamLista.length) {
            mindPrim = false;
        } else {
            mindPrim = true;
        }
        return mindPrim;
    }

    private static int legnagyobbPrimszam(int[] szamLista) {
        int m = 0;
        for (int i = 1; i < szamLista.length; i++) {
            if (primSzam(szamLista[i]) && szamLista[i] > szamLista[m]) {
                m = i;
            }
        }
        return szamLista[m];
    }

    private static boolean primSzam(int szam) {
        if (szam <= 1) {
            return false;
        }
        for (int i = 2; i < szam; i++) {
            if (szam % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] listaLetrehozas() {
        int[] lista = {2, 4, 7, 5};
//        for (int i = 0; i < lista.length; i++) {
//            lista[i] = rnd.nextInt(0, 10);
//        }
        return lista;
    }
}
