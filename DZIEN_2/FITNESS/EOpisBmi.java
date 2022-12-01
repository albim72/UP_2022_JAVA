public enum EOpisBmi {
    NIEDOWAGA("masz niedowagę"),
    PRAWIDLOWA("twoja wagajest prawidłowa!"),
    NADWAGA("masz nadowagę"),
    OTYLOSC1("otyłość I stopnia"),
    OTYLOSC2("otyłość II stopnia"),
    OTYLOSC3("otyłość III stopnia");

    private final String info;

    EOpisBmi(String info) {
        this.info = info;
    }

    public String info(){
        return info;
    }
}
