import classes.CurrentConditionObserver;
import classes.ForecastObserver;
import classes.StatistisObserver;
import classes.WeatherData;

public class Main {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionObserver currentConditionObservers = new CurrentConditionObserver(weatherData);
    ForecastObserver statistisObservers = new ForecastObserver(weatherData);

    weatherData.setMeasurements(86F, 90F, 34F);
    weatherData.setMeasurements(90F, 90F, 34F);
    weatherData.setMeasurements(86F, 90F, 34F);
  }
}