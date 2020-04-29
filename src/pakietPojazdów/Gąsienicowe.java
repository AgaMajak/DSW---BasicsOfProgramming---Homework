package pakietPojazdów;

public class Gąsienicowe extends Pojazd {
    private int moc;

    public Gąsienicowe() {
    }

    public Gąsienicowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    final public void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy.");
    }

}
