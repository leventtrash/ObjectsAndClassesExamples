public class Main {
    public static void main(String[] args) {

        Rechteck newRechteck = new Rechteck();
        int ersteLeange = newRechteck.leange = 2;
        int ersteSeite = newRechteck.seite = 8;

        int j;
        int i;
        for (i = 0; i < ersteLeange; i++) {
            for (j = 0; j < ersteSeite; j++) {
                System.out.print(newRechteck.asciZeichen);
            }
            System.out.println();
        }

        System.out.println(Math.round(getFlaecheninhalt(ersteSeite, ersteLeange)));
        System.out.println(Math.round(skalierung(ersteSeite, 3)));
    }

    public static double getFlaecheninhalt(double seite, double leange){
        double flaecheinhalt = seite * leange;
        return flaecheinhalt;
    }

    public static double skalierung(double seitenleange, double faktor){
        double skalierteSeitenLeange = seitenleange * faktor;
        return skalierteSeitenLeange;
    }
}