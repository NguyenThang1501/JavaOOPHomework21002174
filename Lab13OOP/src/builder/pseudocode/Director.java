package builder.pseudocode;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPS(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setGPS(new GPSNavigator());
    }
}
