package pakietPojazdów;

public class Sedan extends Osobowy {
    String model;
    String symbol;

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }

}
