public class Pokoj {
    public static void main(String[] args) {
        Wazon wazon = new Wazon();
        wazon.nazwa = "Wazon";
        wazon.typ = "Stozek";
        wazon.wysokosc = 0.35;
        wazon.iloscRoz = 14;
        wazon.pojemnosc = 0.5;
        Wazon wazon1 = new Wazon();
        wazon1.nazwa = "Wazon";
        wazon1.typ = "Kola";
        wazon1.wysokosc = 0.23;
        wazon1.iloscRoz = 18;
        wazon1.pojemnosc = 1.2;
        System.out.println(wazon.toString() + "\n" + wazon1.toString());

        Wazon wazon2 = new Wazon("Wazon", "Tuba", 0.55, 9, 0.9);
        Wazon wazon3 = new Wazon("Wazon", "Stozek", 0.48, 11, 0.87);
        System.out.println(wazon2.toString() + "\n" + wazon3.toString());
    }
}
