package builder.pseudocode;

public class Manual {
    private final int seats;
    private final Engine engine;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(int seats, Engine engine,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
