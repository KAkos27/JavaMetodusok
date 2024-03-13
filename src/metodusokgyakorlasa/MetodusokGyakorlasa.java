package metodusokgyakorlasa;

public class MetodusokGyakorlasa {

    public static void main(String[] args) {
        eredmenytKiir(gyokotVon(osszegez(2, osszegez(3, 4))));

        eredmenytKiir(gyokotVon(osszegez(new int[]{3, 5, 6, 7, 24})));
    }

    public static int osszegez(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }

    public static int osszegez(int elsoSzam, int masodikSzam) {
        return osszegez(new int[]{elsoSzam, masodikSzam});
    }

    public static double gyokotVon(int szam) {
        double eredmeny = Math.sqrt(szam);
        return eredmeny;
    }

    public static void eredmenytKiir(double gyok) {
        System.out.print(gyok);
    }
}
