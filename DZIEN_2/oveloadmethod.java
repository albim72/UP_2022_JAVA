public class Main {

    public int sum(int x, int y){return (x+y);}
    //oveload - przeciążenie metody
    public int sum(int x, int y,int z){return (x+2*y-z);}
    //oveload - przeciążenie metody
    public double sum(int x, int y,double z){return (x+2*y-z);}
    public double sum(double x, double y){return (x+y);}
    public static void main(String[] args) {

        Main s = new Main();
        System.out.println(s.sum(4,7));
        System.out.println(s.sum(4.66,11.8));
        System.out.println(s.sum(5,8,2));
        System.out.println(s.sum(2,8, 9.44));
    }
}
