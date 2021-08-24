package pers.jason.designmode.observer.official;

import pers.jason.designmode.observer.userdefined.Exhibitor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Jason
 * @date 2021/8/24 23:40
 * @description
 */
public class CurrentConditionsDisplayer implements Observer, Exhibitor {

  private final Observable observable;

  private float temperature;

  private float humidity;

  private float pressure;

  public CurrentConditionsDisplayer(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      this.pressure = weatherData.getPressure();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("当前天气：【温度 " + temperature + "，湿度 " + humidity + "，气压：" + pressure + "】");
  }
}
