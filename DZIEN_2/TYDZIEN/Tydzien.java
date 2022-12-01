enum Dzien{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Tydzien {
    Dzien dzien;

    public Tydzien(Dzien dzien) {
        this.dzien = dzien;
    }

    public void dzienJak(){
        switch (dzien){
            case MONDAY:
                System.out.println("Nie lubię Poniedziałku...");
                break;
            case FRIDAY:
                System.out.println("Piątki są piękne!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Wolne weekendy są najlepsze!");
                break;
            default:
                System.out.println("Środek tygodnia jest fifty-fifty");
                break;
        }
    }
}
