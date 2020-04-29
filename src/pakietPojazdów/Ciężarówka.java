package pakietPojazdów;

public class Ciężarówka extends Kołowe {
    private double udźwig;

    public Ciężarówka() {
    }

    public Ciężarówka(int rokProdukcji, String rodzajSilnika, String kolor, double masa, String rozmiarOpony, double udźwig) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.udźwig = udźwig;
    }

    public double getUdźwig() {
        return udźwig;
    }

    public void setUdźwig(double udźwig) {
        this.udźwig = udźwig;
    }

    void podnieśSkrzynie() {
    }

}
