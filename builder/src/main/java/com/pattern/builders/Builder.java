package com.pattern.builders;

import com.pattern.cars.CarType;
import com.pattern.components.Engine;
import com.pattern.components.GPSNavigator;
import com.pattern.components.Transmission;
import com.pattern.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
