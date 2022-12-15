import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.cunstructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("rodzaj samochódu:\n" + car.getCarType() );

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.cunstructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nZbudowano: \n"+carManual.print());
    }
}
