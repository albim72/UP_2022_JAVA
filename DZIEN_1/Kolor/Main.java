class Kolor {
    //opis stanu
    int id;
    String nazwa;
    String paleta = "Paleta X";

    public Kolor(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }
    //opis zachowania
    public void PrintKolor()
    {
        System.out.println("Kolor id: " + id + ", nazwa: " + nazwa + ", paleta:" + paleta);
    }
}

public class Main {
    public static void main(String[] args) {
        Kolor mkolor = new Kolor(23,"czerwony");
        mkolor.PrintKolor();

        Kolor dkolor = new Kolor(2,"czarny");
        dkolor.paleta = "Paleta A";
        dkolor.PrintKolor();

        Kolor tkolor = new Kolor(11,"żółty");
        tkolor.PrintKolor();

    }
}
