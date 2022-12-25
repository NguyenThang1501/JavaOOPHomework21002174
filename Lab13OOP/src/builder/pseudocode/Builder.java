package builder.pseudocode;

public interface Builder {
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setGPS(GPSNavigator gpsNavigator);
}
