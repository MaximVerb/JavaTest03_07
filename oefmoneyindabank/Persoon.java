package oefmoneyindabank;

public class Persoon {
    Rekening[] rekeningen;
    private String naam;

    public Persoon(Rekening[] rekeningen, String naam) {
        setRekeningen(rekeningen);
        setNaam(naam);
    }

    public Rekening[] getRekeningen() {
        return rekeningen;
    }

    public void setRekeningen(Rekening[] rekeningen) {
        this.rekeningen = rekeningen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
