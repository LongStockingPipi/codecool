package pers.jason.designmode.observer.userdefined;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason
 * @date 2021/8/24 23:14
 * @description
 */
public class WeatherData implements Subject {

  private static final List<Observer> observers = new ArrayList<>();

  private float temperature;

  private float humidity;

  private float pressure;

  @Override
  public void registerObserver(Observer observer) {
    if(!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  @Override
  public void removeObserver(Observer observer) {
    if(observers.contains(observer)) {
      observers.remove(observer);
    }
  }

  @Override
  public void notifyObservers() {
    for(Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
