import java.time.LocalDateTime;

public class
Verlustmeldung {
    private String beschreibung;
    private String aufenthaltsort;
    private String status;
    private LocalDateTime erstelltAm;

    public Verlustmeldung(String beschreibung, String aufenthaltsort) {
        this.beschreibung = beschreibung;
        this.aufenthaltsort = aufenthaltsort;
        this.status = "offen";
        this.erstelltAm = LocalDateTime.now();
    }

    public void abschliessen() {
        this.status = "abgeschlossen";
    }

    public String getStatus() {
        return status;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getAufenthaltsort() {
        return aufenthaltsort;
    }

    public LocalDateTime getErstelltAm() {
        return erstelltAm;
    }
}
