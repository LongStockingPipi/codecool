package pers.jason.designmode.observer.official;

/**
 * @author Jason
 * @date 2021/8/24 23:24
 * @description
 */
public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplayer displayer = new CurrentConditionsDisplayer(weatherData);
    weatherData.setMeasurements(28, 65, 30.4f);

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    weatherData.setMeasurements(32.7f, 70, 29.2f);
  }

}
