package oefmoneyindabank;

public class Rekening {
    private int rekeningNr;
    private double bedrag;

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

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public void storten(Rekening rekening, int bedrag) {
        this.setBedrag(this.getBedrag() - bedrag);
        double extraBedrag = rekening.getBedrag() + bedrag;
        rekening.setBedrag(extraBedrag);
    }
}
