package pakietPojazdów;

public class Osobowy extends Kołowe {
    private int ilośćOsób;

    public Osobowy() {
    }

    public Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.ilośćOsób = ilośćOsób;
    }

    public int getIlośćOsób() {
        return ilośćOsób;
    }

    public void setIlośćOsób(int ilośćOsób) {
        this.ilośćOsób = ilośćOsób;
    }

}
