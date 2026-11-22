public class Main {

    public static void main(String[] args) {
        // Normalfall
        Fundmeldung fund = new Fundmeldung(
                "schwarzer Lederbeutel", "München: Neuperlach", "fund_geldbeutel.jpg", "Abgabebox");
        Verlustmeldung verlust = new Verlustmeldung(
                "schwarzer Geldbeutel aus Leder", "München: Neuperlach");

        System.out.println("Fundmeldung vorher: " + fund.getStatus());
        fund.absenden();
        System.out.println("Fundmeldung nach Absenden: " + fund.getStatus());

        Treffer treffer = new Treffer(92, fund, verlust);
        System.out.println("Uebereinstimmung: " + treffer.getUebereinstimmung() + " %");
        if (treffer.pruefen(90)) {
            fund.statusSetzen("gematcht");
        }
        System.out.println("Fundmeldung nach Treffer: " + fund.getStatus());
        System.out.println("Treffer zur Fundmeldung: " + fund.getTreffer().size());

        System.out.println("Verlustmeldung vorher: " + verlust.getStatus());
        verlust.abschliessen();
        System.out.println("Verlustmeldung nachher: " + verlust.getStatus());

        // Randfall: Uebereinstimmung unter dem Schwellenwert
        Fundmeldung fund2 = new Fundmeldung(
                "blauer Rucksack", "München: Hauptbahnhof", "fund_rucksack.jpg", "persönliche Übergabe");
        Verlustmeldung verlust2 = new Verlustmeldung("roter Rucksack", "München: Hauptbahnhof");
        fund2.absenden();

        Treffer schwach = new Treffer(85, fund2, verlust2);
        boolean gueltig = schwach.pruefen(90);
        System.out.println("Randfall (85 %) gueltig: " + gueltig);
        System.out.println("Zweite Fundmeldung bleibt: " + fund2.getStatus());
    }
}