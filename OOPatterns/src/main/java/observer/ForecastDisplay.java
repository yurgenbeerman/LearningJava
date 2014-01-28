package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Lena on 28.01.14.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92;
    private float lastPressure;

    public ForecastDisplay (Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update (Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        //display code here
    }
}
