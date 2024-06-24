package classes;

import interfaces.Observer;
import interfaces.Display;
import interfaces.Weather;

public class StatistisObserver implements Observer, Display {
  private Weather weather;
  Float temp;
  Float humidity;
  Float pressure;

  public StatistisObserver(Weather weather) {
    this.weather = weather;

    weather.register(this);
  }

  @Override
  public void update(Float temp, Float pressure, Float humidity) {

  }

  @Override
  public void display() {

  }
}
