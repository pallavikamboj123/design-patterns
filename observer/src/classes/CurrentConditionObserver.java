package classes;

import interfaces.Observer;
import interfaces.Display;
import interfaces.Weather;

public class CurrentConditionObserver implements Observer, Display {
  private Weather weatherData;
  Float temp;
  Float humidity;

  Float pressure;

  public CurrentConditionObserver(Weather weather) {
    this.weatherData = weather;
    weatherData.register(this);
  }
  @Override
  public void update(Float temp, Float pressure, Float humidity) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;

    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
  }
}
