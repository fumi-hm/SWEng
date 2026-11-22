import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class
Fundmeldung {
    private String beschreibung;
    private String fundort;
    private String foto;
    private String uebergabeart;
    private String status;
    private LocalDateTime erfasstAm;
    private final List<Treffer> treffer = new ArrayList<>();

    public Fundmeldung(String beschreibung, String fundort, String foto, String uebergabeart) {
        this.beschreibung = beschreibung;
        this.fundort = fundort;
        this.foto = foto;
        this.uebergabeart = uebergabeart;
        this.status = "neu";
        this.erfasstAm = LocalDateTime.now();
    }

    public void absenden() {
        this.status = "erfasst";
    }

    public void statusSetzen(String neuerStatus) {
        this.status = neuerStatus;
    }

    public String getStatus() {
        return status;
    }

    // Technische Hilfsmethode zur Abbildung der 1-zu-0..*-Assoziation.
    public void addTreffer(Treffer neuerTreffer) {
        if (!treffer.contains(neuerTreffer)) {
            treffer.add(neuerTreffer);
        }
    }

    public List<Treffer> getTreffer() {
        return new ArrayList<>(treffer);
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getFundort() {
        return fundort;
    }

    public String getFoto() {
        return foto;
    }

    public String uebergabeart() {
        return uebergabeart;
    }

    public LocalDateTime getErfasstAm() {
        return erfasstAm;
    }
}
