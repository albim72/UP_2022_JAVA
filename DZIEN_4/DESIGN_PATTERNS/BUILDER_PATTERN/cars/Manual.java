package cars;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

public class Manual {

    private  final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print(){
        String info = "";
        info += "Typ pojazdu: " + carType + "\n";
        info += "Liczba miejsc: " + seats + "\n";
        info += "Silnik: pojemność: " + engine.getVolume() + ", odległość: " + engine.getMileage() + "\n";
        info += "Transmisja: " + transmission + "\n";
        if(this.tripComputer !=null){
            info += "komputer pokładowy: włączony! \n";
        }
        else{
            info += "komputer pokładowy: wyłączony! \n";
        }
        if (this.gpsNavigator != null){
            info += "GPS Navigator: Włączony! \n";
        }
        else
        {
            info += "GPS Navigator: Wyłączony! \n";
        }
        return info;
    }
}
