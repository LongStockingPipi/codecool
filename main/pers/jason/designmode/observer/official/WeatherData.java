package pers.jason.designmode.observer.official;

import java.util.Observable;

/**
 * @author Jason
 * @date 2021/8/24 23:37
 * @description
 */
public class WeatherData extends Observable {

  private float temperature;

  private float humidity;

  private float pressure;

  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
