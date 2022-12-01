public class AKlon implements Cloneable{
    int i;
    String s;

    public AKlon(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
