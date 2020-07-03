package oefmoneyindabank;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Spaarrekening extends Rekening {
    private Overzichtsrekening overzichtsrekening;
    private static double interest = 2.00;
    private LocalDate now;

    //LocalDate last=LocalDate.of ( 2015, Month.DECEMBER, 31);
    //    LocalDate now= LocalDate.of ( 2016, Month.JANUARY, 1);
    //    java.time.Period period=java.time.Period.between ( last, now);
    //    System.out.println ( period.getDays () );

    public Spaarrekening(int rekeningNr, int bedrag, Overzichtsrekening overzichtsrekening) {
        super(rekeningNr, bedrag);
        setOverzichtsrekening(overzichtsrekening);
        now = LocalDate.now();
    }

    @Override
    public int getRekeningNr() {
        return super.getRekeningNr();
    }

    @Override
    public double getBedrag() {
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
    public void setBedrag(double bedrag) {
        super.setBedrag(bedrag);
    }

    public void setOverzichtsrekening(Overzichtsrekening overzichtsrekening) {
        this.overzichtsrekening = overzichtsrekening;
    }

    @Override
    public void storten(Rekening rekening, int bedrag) {
        if (!(rekening instanceof Overzichtsrekening)) {
            System.out.println("Je dient te storten op een overzichtsrekening");
            return;
        }
        super.storten(rekening, bedrag);
        System.out.printf(
                "De overzichtsrekening heeft nu een bedrag van %.2f\n" +
                        "De spaarrekening heeft nu een bedrag van %.2f\n", rekening.getBedrag(), this.getBedrag());
    }

    public void addInterest() {
        if (controleDate()) {
            this.setBedrag((this.getBedrag() + (this.getBedrag() * (interest / 100))));
        }
    }

    public boolean controleDate() {
        LocalDate nowMachine = LocalDate.now();
        LocalDate overAyear = LocalDate.of(now.getYear()+1,now.getMonth(),now.getDayOfMonth());
        long year = java.time.temporal.ChronoUnit.YEARS.between(now, nowMachine);
        long month = ChronoUnit.MONTHS.between(now, overAyear);
        if (year == 1) {
            this.now = nowMachine;
            return true;
        }
        else
            {
            System.out.println("Er is nog geen jaar verstreken, dus u hebt nog geen recht op interest." +
                    "U dient nog " + month + " maanden te wachten.");
            }
        return false;
    }
}