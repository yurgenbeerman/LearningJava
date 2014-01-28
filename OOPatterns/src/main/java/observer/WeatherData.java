package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Lena on 28.01.14.
 */
public class WeatherData extends Observable {
    private float pressure;
    public WeatherData() {

    }

    public float getPressure() {
        return pressure;
    }
}
