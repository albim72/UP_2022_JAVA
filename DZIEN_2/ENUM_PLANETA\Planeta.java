public enum Planeta {
    MERKURY(3.303E+23,2.4E6),
    WENUS(4.863E+24,6.05E6),
    ZIEMIA(5.976E+24,6.38E6),
    MARS (6.421E+23,3.4E6),
    JOWISZ(1.9E+27,7.15E7),
    SATURN(5.7E+26,6.03E7),
    URAN(8.69E+25,2.56E7),
    NEPTUN(1.024E+26,2.47E7),
    PLUTON(1.27E+22,1.137E6);


    private final double masa;
    private final double promien;


    Planeta(double masa, double promien) {
        this.masa = masa;
        this.promien = promien;
    }

    public double masa(){
        return masa;
    }

    public double radius(){
        return promien;
    }
    
    //uniwersalna stała grawitacyjna
    public static final double G=6.673E-11;
    
    public double przeliczGrawitacje(){
        return G*masa/(promien*promien);
    }
    
    public double przeliczMasy(double innaMasa){
        return innaMasa*przeliczGrawitacje();
    }
}
