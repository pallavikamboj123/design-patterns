package classes;

import interfaces.Observer;
import interfaces.Display;
import interfaces.Weather;

public class ForecastObserver implements Observer, Display {

  private WeatherData weatherData;
  Float temp;
  Float humidity;
  Float pressure;

  boolean tempIncreased;

  public ForecastObserver(WeatherData weather) {
    this.weatherData = weather;
    weatherData.register(this);
  }

  @Override
  public void update(Float temp, Float pressure, Float humidity) {

    tempIncreased = this.temp != null && temp > this.temp;

    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;

    display();
  }

  @Override
  public void display() {
    if (tempIncreased) {
      System.out.println("Improving weather on the way");
      System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    } else {
      System.out.println("Watch out for cold and rainy weather");
      System.out.println("Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
  }
}
