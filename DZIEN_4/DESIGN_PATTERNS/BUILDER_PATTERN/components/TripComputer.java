package components;
import cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Poziom paliwa: " + car.getFuel());
    }

    public  void showStatus(){
        if(this.car.getEngine().isStarted()){
            System.out.println("Samochód jest gotowy do jazdy (odpalony)");
        }
        else {
            System.out.println("samochód nie odpalony");
        }
    }
}
