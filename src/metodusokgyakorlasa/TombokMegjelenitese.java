package metodusokgyakorlasa;

import java.util.Random;

public class TombokMegjelenitese {

    static Random rnd = new Random();

    public static void main(String[] args) {
        betukKiirasaParModon();
    }

    public static void betukKiirasaParModon() {
        betukKiirasaEgySorban(betukKeverese());
        betukKiirasaMatrixosan(betukKeverese());
    }

    public static void betukKiirasaEgySorban(char[] betuk) {
        String szoveg = formaz(betuk, ", ") + "\n";
        kiir(szoveg);
    }

    public static void betukKiirasaMatrixosan(char[] betuk) {
        String szoveg = formaz(betuk) + "\n";
        kiir(szoveg);
    }

    public static char[] betukKeverese() {
        char[] betuk = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        for (int i = 0; i < betuk.length; i++) {
            char ideiglenes;
            int szam = rnd.nextInt(0, betuk.length - 1);
            ideiglenes = betuk[i];
            betuk[i] = betuk[szam];
            betuk[szam] = ideiglenes;
        }
        return betuk;
    }

    public static String formaz(char[] lista, String szeparalo) {
        String formazottSzoveg = "";
        for (int i = 0; i < lista.length; i++) {
            if (i == lista.length - 1) {
                formazottSzoveg += lista[i];
            } else {
                formazottSzoveg += lista[i] + szeparalo;
            }
        }
        return formazottSzoveg;
    }

    public static String formaz(char[] lista) {
        String formazottSzoveg = "";
        for (int i = 1; i <= lista.length; i++) {
            if (i % 3 == 0) {
                formazottSzoveg += lista[i - 1] + "\n";
            } else {
                formazottSzoveg += lista[i - 1] + " ";
            }
        }
        return formazottSzoveg;
    }

    public static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}
