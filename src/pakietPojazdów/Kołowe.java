package pakietPojazdów;

public class Kołowe extends Pojazd {
    private String rozmiarOpony;

    Kołowe() {
    }

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public void uruchomSilnik(String rodzajSilnika) {
        System.out.println("Uruchomiono silnik " + rodzajSilnika);

    }

}
