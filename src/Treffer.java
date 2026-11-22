import java.time.LocalDateTime;

public class Treffer {
    private int uebereinstimmung;
    private LocalDateTime erkanntAm;
    private Fundmeldung fundmeldung;
    private Verlustmeldung verlustmeldung;

    // Demowert: Keine Fachregel fuer eine absolute Uebereinstimmung im Bild festgelegt.
    public Treffer(int uebereinstimmung, Fundmeldung fundmeldung, Verlustmeldung verlustmeldung) {
        this.uebereinstimmung = uebereinstimmung;
        this.erkanntAm = LocalDateTime.now();
        this.fundmeldung = fundmeldung;
        this.verlustmeldung = verlustmeldung;

        if (fundmeldung != null) {
            fundmeldung.addTreffer(this);
        }
    }

    public boolean pruefen(int schwellenwert) {
        return uebereinstimmung >= schwellenwert;
    }

    public int getUebereinstimmung() {
        return uebereinstimmung;
    }

    public LocalDateTime getErkanntAm() {
        return erkanntAm;
    }

    public Fundmeldung getFundmeldung() {
        return fundmeldung;
    }

    public Verlustmeldung getVerlustmeldung() {
        return verlustmeldung;
    }
}
