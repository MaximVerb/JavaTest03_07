package oefmoneyindabank;

public class Rekening {
    private int rekeningNr;
    private int bedrag;

    public Rekening(int rekeningNr, int bedrag) {
        setRekeningNr(rekeningNr);
        setBedrag(bedrag);
    }

    public int getRekeningNr() {
        return rekeningNr;
    }

    public void setRekeningNr(int rekeningNr) {
        this.rekeningNr = rekeningNr;
    }

    public int getBedrag() {
        return bedrag;
    }

    public void setBedrag(int bedrag) {
        this.bedrag = bedrag;
    }

    public void storten(Rekening rekening, int bedrag) {
        this.setBedrag(this.getBedrag() - bedrag);
        int extraBedrag = rekening.getBedrag() + bedrag;
        rekening.setBedrag(extraBedrag);
    }
}
