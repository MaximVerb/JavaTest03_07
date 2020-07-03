package oefmoneyindabank;

public class Overzichtsrekening extends Rekening {

    public Overzichtsrekening(int rekeningNr, int bedrag) {
        super(rekeningNr, bedrag);
    }

    @Override
    public int getRekeningNr() {
        return super.getRekeningNr();
    }

    @Override
    public double getBedrag() {
        return super.getBedrag();
    }

    @Override
    public void setRekeningNr(int rekeningNr) {
        super.setRekeningNr(rekeningNr);
    }

    @Override
    public void setBedrag(double bedrag) {
        super.setBedrag(bedrag);
    }

    @Override
    public void storten(Rekening rekening, int bedrag) {
        super.storten(rekening, bedrag);
        System.out.printf(
                        "De spaarrekening heeft nu een bedrag van %d\n" +
                        "De overzichtsrekening heeft nu een bedrag van %\n",rekening.getBedrag(),this.getBedrag());
    }

    public void afhalen(int bedrag) {
        this.setBedrag(super.getBedrag() - bedrag);
    }
}
