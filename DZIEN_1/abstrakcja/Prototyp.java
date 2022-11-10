public abstract class Prototyp extends MojaA {
    
    protected double a;
    protected double b;

    public Prototyp(double a, double b) {
        this.a = a;
        this.b = b;
        this.Nowy();
    }
    
    public void Nowy(){
        System.out.println("tworzenie instancji klasy Prototyp...");
    }
    
    public abstract double policz();
    
    public abstract double policz_a();
}
