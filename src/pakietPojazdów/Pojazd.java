package pakietPojazdów;

class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private double masa;

    Pojazd() {

    }

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, double masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    void uruchomSilnik() {
        System.out.println("Uruchomiono silnik ");
    }

}
