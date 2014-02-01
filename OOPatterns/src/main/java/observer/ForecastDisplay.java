package observer;

//import java.util.Observable;
//import java.util.Observer;

/**
 * Created by Lena on 28.01.14.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    Subject observable;
    private float currentPressure = (float) 29.92;
    private float lastPressure;
    //private float difference;

    public ForecastDisplay (Subject observable) {
        this.observable = observable;
        observable.registerObserver(this);
        //observable.addObserver(this);
    }

    public void update (Subject observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void update(float temperature, float humidity, float pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        //this.difference = this.currentPressure - this.lastPressure;
        display();
    }


    public void display() {
        System.out.println("Current pressure = " + currentPressure
                + ", last pressure = " + lastPressure + ", predicted pressure = " + (2 * this.currentPressure - this.lastPressure));
    }
}
