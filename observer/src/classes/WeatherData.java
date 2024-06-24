package classes;

import interfaces.Observer;
import interfaces.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Weather {
    private List<Observer> observers;
    private Float temp;
    private Float humidity;
    private Float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
      for (Observer observer : observers) {
        observer.update(temp, humidity, pressure);
      }
//        observers.forEach(observer -> observer.update(temp, humidity, pressure));
    }

    public void setMeasurements(Float temp, Float humidity, Float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }
}
