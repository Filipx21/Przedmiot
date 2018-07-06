public class Wazon {
    protected String nazwa;
    protected String typ;
    protected double wysokosc;
    protected int iloscRoz;
    protected double pojemnosc;

    public Wazon(){}

    public Wazon(String nazwa, String typ, double wysokosc, int iloscRoz, double pojemnosc){
        this.nazwa = nazwa;
        this.typ = typ;
        this.wysokosc = wysokosc;
        this.iloscRoz = iloscRoz;
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return "Wazon{" +
                "nazwa='" + nazwa + '\'' +
                ", typ='" + typ + '\'' +
                ", wysokosc=" + wysokosc +
                ", iloscRoz=" + iloscRoz +
                ", pojemnosc=" + pojemnosc +
                '}';
    }
}
