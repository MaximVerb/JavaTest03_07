package oefmoneyindabank;

public class Spaarrekening extends Rekening {
    private Overzichtsrekening overzichtsrekening;

    public Spaarrekening(int rekeningNr, int bedrag, Overzichtsrekening overzichtsrekening) {
        super(rekeningNr, bedrag);
        setOverzichtsrekening(overzichtsrekening);
    }

    @Override
    public int getRekeningNr() {
        return super.getRekeningNr();
    }

    @Override
    public int getBedrag() {
        return super.getBedrag();
    }

    public Overzichtsrekening getOverzichtsrekening() {
        return overzichtsrekening;
    }

    @Override
    public void setRekeningNr(int rekeningNr) {
        super.setRekeningNr(rekeningNr);
    }

    @Override
    public void setBedrag(int bedrag) {
        super.setBedrag(bedrag);
    }

    public void setOverzichtsrekening(Overzichtsrekening overzichtsrekening) {
        this.overzichtsrekening = overzichtsrekening;
    }

    @Override
    public void storten(Rekening rekening, int bedrag) {
       if (!(rekening instanceof Overzichtsrekening))
        {
            System.out.println("Je dient te storten op een overzichtsrekening");
            return;
        }
            super.storten(rekening, bedrag);
            System.out.printf(
                    "De overzichtsrekening heeft nu een bedrag van %d\n" +
                            "De spaarrekening heeft nu een bedrag van %d\n", rekening.getBedrag(), this.getBedrag());
    }
}
